package com.grupo11.grupo11OO22023.services.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.grupo11.grupo11OO22023.entities.RiegoAutomatico;
import com.grupo11.grupo11OO22023.models.RiegoAutomaticoModel;
import com.grupo11.grupo11OO22023.repositories.IRiegoAutomaticoRepository;
import com.grupo11.grupo11OO22023.services.IRiegoAutomaticoService;

import converters.RiegoAutomaticoConverter;

@Service("riegoAutomaticoService")
public class RiegoAutomaticoService implements IRiegoAutomaticoService {

	@Autowired // inyectar un objeto en una clase en particular
	private IRiegoAutomaticoRepository iriegoAutomaticoRepository;
	
	@Autowired
	@Qualifier("riegoAutomaticoConverter")
	private RiegoAutomaticoConverter riegoAutomaticoConverter;
	
	@Override
	public List<RiegoAutomatico>lstRiegoAutomatico(){
		return iriegoAutomaticoRepository.findAll();
	}
	
	public RiegoAutomatico saveRiegoAutomatico(RiegoAutomatico riegoAutomatico) {
		return iriegoAutomaticoRepository.save(riegoAutomatico);
	}
	
	
	@Override
	public List<RiegoAutomatico> getAll() {
		return iriegoAutomaticoRepository.findAll();
	}

	@Override
	public List<RiegoAutomaticoModel> traerRiegosAutomaticos() {
		List<RiegoAutomaticoModel> models= new ArrayList<RiegoAutomaticoModel>();
		for (RiegoAutomatico riego : iriegoAutomaticoRepository.findAll()) {
			models.add(riegoAutomaticoConverter.entityToModel(riego));
		}
		return models;
	}
}