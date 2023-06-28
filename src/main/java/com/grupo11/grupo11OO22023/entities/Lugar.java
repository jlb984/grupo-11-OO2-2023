package com.grupo11.grupo11OO22023.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Lugar {

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLugar;
	
	@Column(name = "nombreLugar", nullable=false, length=45)
	private String nombreLugar;
	
	@Column(name = "ciudad", nullable=false, length=45)
	private String ciudad;
	
	@Column(name = "posicionGPS", nullable=false, length=45)
	private String posicionGPS;

	public Lugar(String nombreLugar, String ciudad, String posicionGPS) {
		super();
		this.nombreLugar = nombreLugar;
		this.ciudad = ciudad;
		this.posicionGPS = posicionGPS;
	}
	
	
	
}
