package com.projetoDani.projetoDani.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoDani.projetoDani.entities.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {

}
