package com.grupo11.grupo11OO22023.services;

import java.util.List;

import models.PerfilModel;

public interface IPerfilService {
	public List<PerfilModel> listar();
	
	public PerfilModel traerId(long id);
	
	public PerfilModel insertOrUpdate(PerfilModel perfilModel);
	
	public boolean delete(long idPerfil);
	
	PerfilModel traerTipo(String tipo);
	
}