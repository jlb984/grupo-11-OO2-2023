package models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UsuarioModel extends PersonaModel {

	@NotNull(message="Email no puede ser campo vacio")
	private String email;

	@Size(min = 3, max = 20)
	private String username;
	
	@NotNull(message="Password no puede ser campo vacio")
	private String password;
	
	private PerfilModel perfil;

	public UsuarioModel() {
	}

	public UsuarioModel(long idPersona, @Min(6) int dni, @Size(min = 3, max = 20) String nombre,
			@Size(min = 3, max = 20) String apellido, @NotNull(message = "Email no puede ser campo vacio") String email,
			@Size(min = 3, max = 20) String username,
			@NotNull(message = "Password no puede ser campo vacio") String password,
			PerfilModel perfil) {
		super(idPersona, dni, nombre, apellido);
		this.email = email;
		this.username = username;
		this.password = password;
		this.perfil = perfil;
	}
	public UsuarioModel(@Min(6) int dni, @Size(min = 3, max = 20) String nombre,
			@Size(min = 3, max = 20) String apellido, @NotNull(message = "Email no puede ser campo vacio") String email,
			@Size(min = 3, max = 20) String username,
			@NotNull(message = "Password no puede ser campo vacio") String password, PerfilModel perfil) {
		super(dni, nombre, apellido);
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

	public PerfilModel getPerfil() {
		return perfil;
	}

	public void setPerfil(PerfilModel perfil) {
		this.perfil = perfil;
	}

	@Override
	public String toString() {
		return "Usuario: " + username + " ";
	}

	
	
}