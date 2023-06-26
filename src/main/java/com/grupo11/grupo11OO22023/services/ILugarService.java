package com.grupo11.grupo11OO22023.services;

import java.util.List;

import com.grupo11.grupo11OO22023.entities.Lugar;
import com.grupo11.grupo11OO22023.models.LugarModel;

public interface ILugarService {

	public List<Lugar> getAll();

	public LugarModel insertOrUpdate(Lugar lugar);

	public Lugar findById(int id);

	public List<LugarModel> findByNombreLugar(String nombre);
}