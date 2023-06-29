package com.grupo11.grupo11OO22023.models;

import com.grupo11.grupo11OO22023.entities.Lugar;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class DispositivoIOTModel {
	
	
	protected int idDispositivo;
	
	@NotNull(message="EL NOMBRE NO PUEDE ESTAR VACIO")
	@Size(min=3,max=20, message="EL NOMBRE DEBE TENER ENTRE 3 Y 20 CARACTERES")
	protected String nombre;
	
	protected Lugar lugar;
	
	protected boolean estaActivo;
	
	@NotNull(message="LA DESCRIPCION NO PUEDE ESTAR VACIO")
	@Size(min=3,max=20, message="LA DESCRIPCION DEBE TENER ENTRE 3 Y 20 CARACTERES")
	protected String descripcion;
	
	
	public DispositivoIOTModel() {}


	public DispositivoIOTModel(int idDispositivo,
			@NotNull(message = "EL NOMBRE NO PUEDE ESTAR VACIO") @Size(min = 3, max = 20, message = "EL NOMBRE DEBE TENER ENTRE 3 Y 20 CARACTERES") String nombre,
			Lugar lugar, boolean estaActivo,
			@NotNull(message = "LA DESCRIPCION NO PUEDE ESTAR VACIO") @Size(min = 3, max = 20, message = "LA DESCRIPCION DEBE TENER ENTRE 3 Y 20 CARACTERES") String descripcion) {
		super();
		this.idDispositivo = idDispositivo;
		this.nombre = nombre;
		this.lugar = lugar;
		this.estaActivo = estaActivo;
		this.descripcion = descripcion;
	}


	public DispositivoIOTModel(
			@NotNull(message = "EL NOMBRE NO PUEDE ESTAR VACIO") @Size(min = 3, max = 20, message = "EL NOMBRE DEBE TENER ENTRE 3 Y 20 CARACTERES") String nombre,
			Lugar lugar, boolean estaActivo,
			@NotNull(message = "LA DESCRIPCION NO PUEDE ESTAR VACIO") @Size(min = 3, max = 20, message = "LA DESCRIPCION DEBE TENER ENTRE 3 Y 20 CARACTERES") String descripcion) {
		super();
		this.nombre = nombre;
		this.lugar = lugar;
		this.estaActivo = estaActivo;
		this.descripcion = descripcion;
	}


	public int getIdDispositivo() {
		return idDispositivo;
	}


	public void setIdDispositivo(int idDispositivo) {
		this.idDispositivo = idDispositivo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Lugar getLugar() {
		return lugar;
	}


	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}


	public boolean isEstaActivo() {
		return estaActivo;
	}


	public void setEstaActivo(boolean estaActivo) {
		this.estaActivo = estaActivo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	@Override
	public String toString() {
		return "DispositivoIOTModel [idDispositivo=" + idDispositivo + ", nombre=" + nombre + ", lugar=" + lugar
				+ ", estaActivo=" + estaActivo + ", descripcion=" + descripcion + "]";
	}
	
	
}
