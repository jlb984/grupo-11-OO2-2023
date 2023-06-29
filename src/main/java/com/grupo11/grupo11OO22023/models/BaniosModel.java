package com.grupo11.grupo11OO22023.models;

import java.time.LocalDateTime;

import com.grupo11.grupo11OO22023.entities.DispositivoIOT;
import com.grupo11.grupo11OO22023.entities.Lugar;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class BaniosModel extends DispositivoIOT{
	
	private boolean ocupado;
	
	private int nivelDeposito;
	

	public BaniosModel(int idDispositivo, String nombre, Lugar lugar, boolean estaActivo, String descripcion, boolean ocupado, int nivelDeposito, LocalDateTime horaUltimaLimpieza) {
		super(idDispositivo, nombre, lugar, estaActivo, descripcion);
		// TODO Auto-generated constructor stub
		this.ocupado = ocupado;
		this.nivelDeposito = nivelDeposito;
	}
	
	
}