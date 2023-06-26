package com.grupo11.grupo11OO22023.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo11.grupo11OO22023.entities.DispositivoIOT;
import com.grupo11.grupo11OO22023.services.implementation.DispositivoIOTService;

@RestController
@RequestMapping("/dispositivoiot")
public class DispositivoIOTController {
	
	@Autowired
	private DispositivoIOTService dispositivoIOTService;
	
	@GetMapping
	public List<DispositivoIOT> getDispositivoIOT(){
		return this.dispositivoIOTService.lstDispositivosIOT();
	}
	
	@GetMapping(path = "/{id}")
	public Optional<DispositivoIOT> getbyId(@PathVariable("id") int id ){
		return this.dispositivoIOTService.getDispositivoIOTporId(id);
	}
	
	
	
}
