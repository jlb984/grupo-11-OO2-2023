package com.grupo11.grupo11OO22023.entities;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


import lombok.Data;

@Entity // persistence
@Data // Lombok = auto-boilerplate
@Table(name="user") // database
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUser;
	
	// Variables in ascending order

	
	@NotNull
	@Column(name="document")
	private long document; // Example: 11.111.111
	
	@Column(name="enabled")
	private boolean enabled; // active or not
	
	@Email
	@NotEmpty
	@Column(name="email")
	private String email; // Example: AAAAA@provider.domain

	@Size(min=2, max=25)
	@Column(name="name")
	private String name; // Example: AAAAAA
	
	@Size(min=8) 
	@Column(name="password")
	private String password; // Example: abcde11_UNLA
	
	@ManyToOne(cascade=CascadeType.PERSIST) // Relation with Role
	@JoinColumn(name="idRole")
	private Rol rol;
	
	@Size(min=2, max=30)
	@Column(name="surname")
	private String surname; 
	
	@Column(name="type")
	private String type; 
	
	@Size(min=4, max=20)
	@Column(name="userName")
	private String userName; // Example: unlaUser

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public long getDocument() {
		return document;
	}

	public void setDocument(long document) {
		this.document = document;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
