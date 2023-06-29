package com.grupo11.grupo11OO22023.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
@PrimaryKeyJoinColumn(referencedColumnName="idDispositivo", name= "idRiegoAutomatico") // Herencia - Referencia el Id del padre
@Table (name="riegoAutomatico")
public class RiegoAutomatico extends DispositivoIOT {

	// Al ser hijo NO es necesario que declare un Id, usara el que esta en referencedColumnName

	@Column(name= "nivelHumedad") 
	private int nivelHumedad;
	
	@Column(name="temperatura")
	private float temperatura;
	
	@Column(name="nivelUV")
	private int nivelUV;

	public RiegoAutomatico(int idDispositivo, String nombre, Lugar lugar, boolean estaActivo, String descripcion,
			int nivelHumedad, float temperatura, int nivelUV) {
		super(idDispositivo, nombre, lugar, estaActivo, descripcion);
		this.nivelHumedad = nivelHumedad;
		this.temperatura = temperatura;
		this.nivelUV = nivelUV;
	}
	
	
}