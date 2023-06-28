package com.grupo11.grupo11OO22023.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter @Setter @NoArgsConstructor
public abstract class DispositivoIOT {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	protected int idDispositivo;
	
	@Column(name = "nombre", nullable=false, length=45)
	protected String nombre;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="idLugar",nullable=false)
	protected Lugar lugar;
	
	@Column(name = "estaActivo")
	protected boolean estaActivo;
	
	@Column(name = "descripcion", length = 200)
	protected String descripcion;

	public DispositivoIOT(int idDispositivo, String nombre, Lugar lugar, boolean estaActivo, String descripcion) {
		this.idDispositivo = idDispositivo;
		this.nombre = nombre;
		this.lugar = lugar;
		this.estaActivo = estaActivo;
		this.descripcion = descripcion;
	}
	
	
}
