package com.grupo11.grupo11OO22023.services.implementation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.grupo11.grupo11OO22023.entities.DispositivoIOT;
import com.grupo11.grupo11OO22023.entities.Lugar;
import com.grupo11.grupo11OO22023.repositories.IDispositivoIOTRepository;
import com.grupo11.grupo11OO22023.services.IDispositivoIOTService;

@Service("dispositivoIOTService")
public class DispositivoIOTService implements IDispositivoIOTService {
	
	@Autowired
	@Qualifier("dispositivoIOTRepository")
	private IDispositivoIOTRepository iDispositivoIOTRepository;
	
	@Override
	public List<DispositivoIOT> getAll() {

		return iDispositivoIOTRepository.findAll();
	}
	
	@Override
	public DispositivoIOT findByIdDispositivo(int id){
		return iDispositivoIOTRepository.findByIdDispositivo(id);
	}
	
	@Override
	public List<DispositivoIOT> findByLugar(Lugar lugar){
		return iDispositivoIOTRepository.findByLugar(lugar);
	}
}
