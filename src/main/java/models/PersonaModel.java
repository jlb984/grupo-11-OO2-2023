package models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class PersonaModel {
	protected long idPersona;
	
	@NotNull(message="EL DNI NO PUEDE ESTAR VACIO")
	@Min(value=8,message="EL DNI ES INCORRECTO")
	protected int dni;
	
	@NotNull(message="EL NOMBRE NO PUEDE ESTAR VACIO")
	@Size(min=3,max=20, message="EL NOMBRE DEBE TENER ENTRE 3 Y 20 CARACTERES")
	protected String nombre;
	
	@NotNull(message="EL APELLIDO NO PUEDE ESTAR VACIO")
	@Size(min=3,max=20, message="EL APELLIDO DEBE TENER ENTRE 3 Y 20 CARACTERES")
	protected String apellido;
	
	public PersonaModel() {}
	
	public PersonaModel(long idPersona, @Min(6) int dni, @Size(min = 3, max = 20) String nombre,
			@Size(min = 3, max = 20) String apellido) {
		super();
		this.idPersona = idPersona;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public PersonaModel(@Min(6) int dni, @Size(min = 3, max = 20) String nombre,
			@Size(min = 3, max = 20) String apellido) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(long idPersona) {
		this.idPersona = idPersona;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dni;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonaModel other = (PersonaModel) obj;
		if (dni != other.dni)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona con Documento:" + dni + ", Nombre: " + nombre + " Y Apellido: " + apellido;
	}
	
	
}