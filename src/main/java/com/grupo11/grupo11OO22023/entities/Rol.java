package com.grupo11.grupo11OO22023.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Data; // no toma loombok


@Entity // persistence
@Data // // Lombok = auto-boilerplate
@Table(name="user_role") // database
public class Rol  { // Perfiles

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRole;
	
	@Size(min=2, max=20)
	@Column(name="name")
	private String name; // ROLE_ADMIN / ROLE_AUDIT	

	public int getIdRole() {
		return idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
