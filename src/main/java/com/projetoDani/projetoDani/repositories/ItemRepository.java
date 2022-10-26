package com.projetoDani.projetoDani.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoDani.projetoDani.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{

}
