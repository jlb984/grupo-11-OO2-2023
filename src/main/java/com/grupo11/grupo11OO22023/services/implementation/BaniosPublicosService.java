
package com.grupo11.grupo11OO22023.services.implementation;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.grupo11.grupo11OO22023.entities.BaniosPublicos;
import com.grupo11.grupo11OO22023.models.BaniosModel;
import com.grupo11.grupo11OO22023.repositories.IBaniosPublicosRepository;
import com.grupo11.grupo11OO22023.services.IBaniosPublicosService;

@Service
public class BaniosPublicosService implements IBaniosPublicosService {
	
	@Autowired
	@Qualifier("baniosPublicosRepository")
	private IBaniosPublicosRepository iBaniosPublicosRepository;
	
	private ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public List<BaniosPublicos> getAll(){
		return iBaniosPublicosRepository.findAll();
	}
	
	@Override
	public BaniosModel insertOrUpdate(BaniosPublicos banio) {
		BaniosPublicos banioNuevo = iBaniosPublicosRepository.save(banio);
		return modelMapper.map(banioNuevo, BaniosModel.class);
	}
	
}
