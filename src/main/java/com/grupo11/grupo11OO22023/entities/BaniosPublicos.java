
package com.grupo11.grupo11OO22023.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
@PrimaryKeyJoinColumn(referencedColumnName="idDispositivo", name= "idBaniosPublicos") // Herencia - Referencia el Id del padre

@Table(name="BaniosPublicos")
public class BaniosPublicos extends DispositivoIOT{
	
	// Al ser hijo NO es necesario que declare un Id, usara el que esta en referencedColumnName

	@Column(name = "ocupado")
	private boolean ocupado;
	
	@Column(name = "nivelDeposito")
	private int nivelDeposito;
	
	@Column(name = "horaUltimaLimpieza")
	private LocalDateTime horaUltimaLimpieza;

	public BaniosPublicos(int idDispositivo, String nombre, Lugar lugar, boolean estaActivo, String descripcion, boolean ocupado, int nivelDeposito, LocalDateTime horaUltimaLimpieza) {
		super(idDispositivo, nombre, lugar, estaActivo, descripcion);
		// TODO Auto-generated constructor stub
		this.ocupado = ocupado;
		this.nivelDeposito = nivelDeposito;
		this.horaUltimaLimpieza = horaUltimaLimpieza;
	}
	
	
}
