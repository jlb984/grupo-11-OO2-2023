package com.grupo11.grupo11OO22023.models;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class LugarModel {
	
	
	private int idLugar;
	
	@Size(min = 3, max = 20, message = "el nombre debe tener mas de 3 letras y menos de 20.")
	private String nombreLugar;
	
	@Size(min = 3, max = 20, message = "Ciudad debe tener mas de 3 letras y menos de 20.")
	private String ciudad;
	
	@Pattern(regexp = "^[a-zA-Z]\\w{3,14}$", message = "debe contener letras seguidos de numeros")
	private String posicionGPS;
	


	public LugarModel(int idLugar, String nombreLugar, String ciudad, String posicionGPS) {
		this.setIdLugar(idLugar);
		this.nombreLugar = nombreLugar;
		this.ciudad = ciudad;
		this.posicionGPS = posicionGPS;
	}
	
	

	

}
