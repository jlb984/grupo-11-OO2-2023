package com.grupo11.grupo11OO22023.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupo11.grupo11OO22023.entities.RiegoAutomatico;
import com.grupo11.grupo11OO22023.repositories.IRiegoAutomaticoRepository;
import com.grupo11.grupo11OO22023.services.IRiegoAutomaticoService;

@Service
public class RiegoAutomaticoService implements IRiegoAutomaticoService {

	@Autowired // inyectar un objeto en una clase en particular
	private IRiegoAutomaticoRepository iriegoAutomaticoRepository;
	
	@Override
	public List<RiegoAutomatico>lstRiegoAutomatico(){
		return iriegoAutomaticoRepository.findAll();
	}
	
	public RiegoAutomatico saveRiegoAutomatico(RiegoAutomatico riegoAutomatico) {
		return iriegoAutomaticoRepository.save(riegoAutomatico);
	}
}
