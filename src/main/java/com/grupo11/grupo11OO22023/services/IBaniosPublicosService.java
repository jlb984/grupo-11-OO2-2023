
package com.grupo11.grupo11OO22023.services;

import java.util.List;

import com.grupo11.grupo11OO22023.entities.BaniosPublicos;
import com.grupo11.grupo11OO22023.models.BaniosModel;

public interface IBaniosPublicosService {
	
	public List<BaniosPublicos> getAll();

	public BaniosModel insertOrUpdate(BaniosPublicos banio);

}
