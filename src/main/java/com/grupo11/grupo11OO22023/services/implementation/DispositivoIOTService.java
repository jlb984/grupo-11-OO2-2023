package com.grupo11.grupo11OO22023.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupo11.grupo11OO22023.entities.DispositivoIOT;
import com.grupo11.grupo11OO22023.repositories.IDispositivoIOTRepository;
import com.grupo11.grupo11OO22023.services.IDispositivoIOTService;

@Service
public class DispositivoIOTService implements IDispositivoIOTService {
	
	@Autowired
	private IDispositivoIOTRepository DispositivoIOTRepository;
	
	@Override
	public List<DispositivoIOT> lstDispositivosIOT() {
		// TODO Auto-generated method stub
		return DispositivoIOTRepository.findAll();
	}

}
