package com.grupo11.grupo11OO22023.services.implementation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupo11.grupo11OO22023.entities.Lugar;
import com.grupo11.grupo11OO22023.repositories.ILugarRepository;
import com.grupo11.grupo11OO22023.services.ILugarService;

@Service
public class LugarService implements ILugarService {
	
	@Autowired
	private ILugarRepository iLugarRepository;
	
	@Override
	public List<Lugar> lstLugar(){
		return iLugarRepository.findAll();	
	}
}
