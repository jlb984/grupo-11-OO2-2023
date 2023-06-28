package com.grupo11.grupo11OO22023.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo11.grupo11OO22023.entities.RiegoAutomatico;


@Repository
public interface IRiegoAutomaticoRepository extends JpaRepository<RiegoAutomatico, Serializable> {

}
