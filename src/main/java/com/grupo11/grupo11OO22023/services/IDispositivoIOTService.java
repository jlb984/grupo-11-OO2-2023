package com.grupo11.grupo11OO22023.services;

import java.util.List;

import com.grupo11.grupo11OO22023.entities.DispositivoIOT;
import com.grupo11.grupo11OO22023.entities.Lugar;

public interface IDispositivoIOTService  {
	
	public DispositivoIOT findById(int id);
	
	public List<DispositivoIOT> findByLugar(Lugar lugar);

	List<DispositivoIOT> getAll();
}
