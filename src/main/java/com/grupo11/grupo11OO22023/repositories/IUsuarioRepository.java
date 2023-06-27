package com.grupo11.grupo11OO22023.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupo11.grupo11OO22023.entities.Usuario;
// es como el dao. capa de persistencia
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {

	Usuario findByUserName(String userName);
}
