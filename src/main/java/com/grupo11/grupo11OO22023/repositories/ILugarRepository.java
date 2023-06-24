package com.grupo11.grupo11OO22023.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.grupo11.grupo11OO22023.entities.Lugar;


@Repository("lugarRepository")
public interface ILugarRepository extends JpaRepository<Lugar, Serializable>{

	public abstract Lugar findByIdLugar(int idLugar); //el nombre del metodo debe incorporar el nombre del atributo exacto, sino no funciona
	

	public abstract List<Lugar> findByNombreLugar(String nombre);

}
