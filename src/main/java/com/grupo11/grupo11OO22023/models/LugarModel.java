package com.grupo11.grupo11OO22023.models;

import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class LugarModel {
	
	
	private int idLugar;
	
	@Size(min=3, max=20)
	private String nombreLugar;
	
	@Size(min=3, max=20)
	private String ciudad;
	
	@Size(min=3, max=20)
	private String posicionGPS;

	public LugarModel(int idLugar, @Size(min = 3, max = 20) String nombreLugar, @Size(min = 3, max = 20) String ciudad,
			@Size(min = 3, max = 20) String posicionGPS) {
		this.setIdLugar(idLugar); 
		this.nombreLugar = nombreLugar;
		this.ciudad = ciudad;
		this.posicionGPS = posicionGPS;
	}

	

}
