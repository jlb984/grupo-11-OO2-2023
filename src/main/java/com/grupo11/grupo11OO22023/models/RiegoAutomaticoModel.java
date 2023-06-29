package com.grupo11.grupo11OO22023.models;

import com.grupo11.grupo11OO22023.entities.Lugar;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class RiegoAutomaticoModel extends DispositivoIOTModel {

	@NotNull(message="EL NIVELHUMEDAD NO PUEDE ESTAR VACIO")
	@Min(value=8,message="EL NIVELHUMEDAD ES INCORRECTO")
	private int nivelHumedad;
		
	private float temperatura;
	
	@NotNull(message="EL NIVELUV NO PUEDE ESTAR VACIO")
	@Min(value=8,message="EL NIVELUV ES INCORRECTO")
	private int nivelUV;

	public RiegoAutomaticoModel() {
	

	}

	

	public RiegoAutomaticoModel(int idDispositivo,@NotNull(message = "EL NOMBRE NO PUEDE ESTAR VACIO") @Size(min = 3, max = 20, message = "EL NOMBRE DEBE TENER ENTRE 3 Y 20 CARACTERES") String nombre,
			Lugar lugar, boolean estaActivo,@NotNull(message = "LA DESCRIPCION NO PUEDE ESTAR VACIO") @Size(min = 3, max = 20, message = "LA DESCRIPCION DEBE TENER ENTRE 3 Y 20 CARACTERES") String descripcion,
			@NotNull(message = "EL NIVELHUMEDAD NO PUEDE ESTAR VACIO") @Min(value = 8, message = "EL NIVELHUMEDAD ES INCORRECTO") int nivelHumedad,
			float temperatura,@NotNull(message = "EL NIVELUV NO PUEDE ESTAR VACIO") @Min(value = 8, message = "EL NIVELUV ES INCORRECTO") int nivelUV) {
		super(idDispositivo,nombre, lugar, estaActivo, descripcion);
		this.nivelHumedad = nivelHumedad;
		this.temperatura = temperatura;
		this.nivelUV = nivelUV;
	}

	


	public RiegoAutomaticoModel(@NotNull(message = "EL NOMBRE NO PUEDE ESTAR VACIO") @Size(min = 3, max = 20, message = "EL NOMBRE DEBE TENER ENTRE 3 Y 20 CARACTERES") String nombre,
			Lugar lugar, boolean estaActivo,@NotNull(message = "LA DESCRIPCION NO PUEDE ESTAR VACIO") @Size(min = 3, max = 20, message = "LA DESCRIPCION DEBE TENER ENTRE 3 Y 20 CARACTERES") String descripcion,
			@NotNull(message = "EL NIVELHUMEDAD NO PUEDE ESTAR VACIO") @Min(value = 8, message = "EL NIVELHUMEDAD ES INCORRECTO") int nivelHumedad,
			float temperatura,@NotNull(message = "EL NIVELUV NO PUEDE ESTAR VACIO") @Min(value = 8, message = "EL NIVELUV ES INCORRECTO") int nivelUV) {
		super(nombre, lugar, estaActivo, descripcion);
		this.nivelHumedad = nivelHumedad;
		this.temperatura = temperatura;
		this.nivelUV = nivelUV;
	}



	public RiegoAutomaticoModel(
			@NotNull(message = "EL NOMBRE NO PUEDE ESTAR VACIO") @Size(min = 3, max = 20, message = "EL NOMBRE DEBE TENER ENTRE 3 Y 20 CARACTERES") String nombre,
			Lugar lugar, boolean estaActivo,
			@NotNull(message = "LA DESCRIPCION NO PUEDE ESTAR VACIO") @Size(min = 3, max = 20, message = "LA DESCRIPCION DEBE TENER ENTRE 3 Y 20 CARACTERES") String descripcion) {
		super(nombre, lugar, estaActivo, descripcion);
	}

	public int getNivelHumedad() {
		return nivelHumedad;
	}

	public void setNivelHumedad(int nivelHumedad) {
		this.nivelHumedad = nivelHumedad;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public int getNivelUV() {
		return nivelUV;
	}

	public void setNivelUV(int nivelUV) {
		this.nivelUV = nivelUV;
	}

	@Override
	public String toString() {
		return "RiegoAutomaticoModel [nivelHumedad=" + nivelHumedad + ", temperatura=" + temperatura + ", nivelUV="
				+ nivelUV + "]";
	}

	
}
