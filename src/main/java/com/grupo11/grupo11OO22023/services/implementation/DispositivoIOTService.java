package com.grupo11.grupo11OO22023.services.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupo11.grupo11OO22023.entities.DispositivoIOT;
import com.grupo11.grupo11OO22023.repositories.IDispositivoIOTRepository;
import com.grupo11.grupo11OO22023.services.IDispositivoIOTService;

@Service
public class DispositivoIOTService implements IDispositivoIOTService {
	
	@Autowired
	private IDispositivoIOTRepository DispositivoIOTRepository;
	
	
	public List<DispositivoIOT> lstDispositivosIOT() {

		return DispositivoIOTRepository.findAll();
	}
	
	public Optional<DispositivoIOT> getDispositivoIOTporId(int id){
		return DispositivoIOTRepository.findById(id);
	}
}
