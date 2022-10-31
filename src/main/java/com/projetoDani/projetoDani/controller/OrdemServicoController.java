package com.projetoDani.projetoDani.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projetoDani.projetoDani.entities.OrdemServico;
import com.projetoDani.projetoDani.entities.Venda;
import com.projetoDani.projetoDani.repositories.OrdemServicoRepository;

@CrossOrigin(origins = "*")
@RestController
public class OrdemServicoController {

	private final OrdemServicoRepository repository;

	public OrdemServicoController(OrdemServicoRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/ordemServicos")
	List<OrdemServico> all() {
		return repository.findAll();
	}

	@PostMapping("/ordemServicos")
	OrdemServico newOs(@RequestBody OrdemServico os) {
		return repository.save(os);
	}
}
