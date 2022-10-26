package com.projetoDani.projetoDani.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.projetoDani.projetoDani.entities.Venda;
import com.projetoDani.projetoDani.repositories.VendaRepository;

@CrossOrigin(origins = "*")
@RestController
public class VendaController {
	private final VendaRepository repository;

	public VendaController(VendaRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/vendas")
	List<Venda> all() {
		return repository.findAll();
	}

	@GetMapping("/vendas/{id}")
	Venda venda(@PathVariable Long id) {
		return repository.findById(id).orElseThrow();
	}

	@GetMapping("/vendas/numeroVenda/{numeroVenda}/{filial}")
	Venda numeroVenda(@PathVariable String numeroVenda, @PathVariable String filial) {

		List<Venda> listaVenda = repository.findAll();

		Venda v = new Venda();

		for (Venda venda : listaVenda) {
			if (venda.getNumeroVenda().equals(numeroVenda)
					&& venda.getFilial().toLowerCase().equals(filial.toLowerCase())) {
				v = venda;
			}
		}

		return v;
	}

	@PostMapping("/vendas")
	Venda newVenda(@RequestBody Venda venda) {
		return repository.save(venda);
	}

	@PostMapping("/vendasList")
	public @ResponseBody List<Venda> batchCreate(@RequestBody List<Venda> lista) {

		for (Venda venda : lista) {
			repository.save(venda);
		}

		return (lista);
	}

}
