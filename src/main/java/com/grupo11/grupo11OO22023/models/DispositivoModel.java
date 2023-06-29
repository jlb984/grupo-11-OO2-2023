package com.grupo11.grupo11OO22023.models;

import com.grupo11.grupo11OO22023.entities.Lugar;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public abstract class DispositivoModel {
	
	protected int idDispositivo;
	
	@Size(min = 3, max = 20, message = "el nombre debe tener mas de 3 letras y menos de 20.")
	protected String nombre;
	
	@Size(min = 3, max = 20, message = "Ciudad debe tener mas de 3 letras y menos de 20.")
	protected Lugar lugar;
	
	protected boolean estaActivo;
	
	@Size(min = 3, max = 20, message = "Ciudad debe tener mas de 3 letras y menos de 20.")
	protected String descripcion;

	public DispositivoModel(int idDispositivo, String nombre, Lugar lugar, boolean estaActivo, String descripcion) {
		this.setIdDispositivo(idDispositivo);
		this.nombre = nombre;
		this.lugar = lugar;
		this.estaActivo = estaActivo;
		this.descripcion = descripcion;
	}
	
	
}
