package com.grupo11.grupo11OO22023.services.implementation;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.grupo11.grupo11OO22023.entities.Lugar;
import com.grupo11.grupo11OO22023.models.LugarModel;
import com.grupo11.grupo11OO22023.repositories.ILugarRepository;
import com.grupo11.grupo11OO22023.services.ILugarService;


@Service("lugarService")
public class LugarService implements ILugarService {
	
	@Autowired
	@Qualifier("lugarRepository")
	private ILugarRepository iLugarRepository;
	
	private ModelMapper modelMapper = new ModelMapper();

	@Override
	public List<Lugar> getAll() {
		return iLugarRepository.findAll();
	}

	

	@Override
	public LugarModel insertOrUpdate(Lugar lugar) {
		Lugar lugarNuevo = iLugarRepository.save(lugar);
		return modelMapper.map(lugarNuevo, LugarModel.class);
	}

	
	
}
