package com.projetoDani.projetoDani.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoDani.projetoDani.entities.Item;
import com.projetoDani.projetoDani.repositories.ItemRepository;

@CrossOrigin(origins = "*")
@RestController
public class ItemCrontroller {

	private final ItemRepository repository;

	public ItemCrontroller(ItemRepository repository) {
		this.repository = repository;
	}

	@GetMapping("item/")
	List<Item> all() {
		return repository.findAll();
	}
}
