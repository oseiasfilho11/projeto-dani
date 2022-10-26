package com.projetoDani.projetoDani.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoDani.projetoDani.entities.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}
