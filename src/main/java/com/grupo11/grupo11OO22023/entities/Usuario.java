package com.grupo11.grupo11OO22023.entities;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@DynamicInsert(true)
@DynamicUpdate(true)
@Table(name = "usuario")
@PrimaryKeyJoinColumn(name = "idPersona")
public class Usuario extends Persona{
	
	@Column(name = "email", unique = true)
	private String email;
	
	@Column(name = "username", unique = true, nullable = false, length = 45)
	private String username;
	
	@Column(name = "password", nullable = false, length = 100)
	private String password;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
	@JoinColumn(name = "perfil_idPerfil", nullable = false)
	private Perfil perfil;
	
	public Usuario() {}
	
	public Usuario(long idPersona,String nombre, String apellido, int dni, String email, String username, String password, Perfil perfil) {
		super(idPersona,nombre, apellido, dni);
		this.email = email;
		this.username = username;
		this.password = password;
		this.perfil = perfil;
	}

	public Usuario(String nombre, String apellido, int dni, String email, String username, String password, Perfil perfil) {
		super(nombre, apellido, dni);
		this.email = email;
		this.username = username;
		this.password = password;
		this.perfil = perfil;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
	
	
}
