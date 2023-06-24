package models;

import jakarta.validation.constraints.NotEmpty;

public class PerfilModel {
	
	private long idPerfil;
	
	@NotEmpty (message="El tipo no puede ser un campo vacio")
	private String tipo;
	
	public PerfilModel(long idPerfil,@NotEmpty(message="El tipo no puede ser un campo vacio") String tipo) {
		super();
		this.idPerfil = idPerfil;
		this.tipo = tipo;
	}
	
	public PerfilModel() {}
	
	public PerfilModel(@NotEmpty(message="El tipo no puede ser un campo vacio") String tipo) {
		super();
		this.tipo = tipo;
	}
	public long getIdPerfil() {
		return idPerfil;
	}
	public void setIdPerfil(long idPerfil) {
		this.idPerfil = idPerfil;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Perfil: " + tipo + " ";
	}
	
	
	
}
