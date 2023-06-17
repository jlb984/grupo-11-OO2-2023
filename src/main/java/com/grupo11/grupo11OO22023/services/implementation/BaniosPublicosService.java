package com.grupo11.grupo11OO22023.services.implementation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupo11.grupo11OO22023.entities.BaniosPublicos;
import com.grupo11.grupo11OO22023.repositories.IBaniosPublicosRepository;
import com.grupo11.grupo11OO22023.services.IBaniosPublicosService;

@Service
public class BaniosPublicosService implements IBaniosPublicosService {
	
	@Autowired
	private IBaniosPublicosRepository iBaniosPublicosRepository;
	
	@Override
	public List<BaniosPublicos> lstBaniosPublicos(){
		return iBaniosPublicosRepository.findAll();
	}
}
