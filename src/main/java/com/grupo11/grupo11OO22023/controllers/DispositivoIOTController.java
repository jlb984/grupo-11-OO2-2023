package com.grupo11.grupo11OO22023.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.grupo11.grupo11OO22023.entities.DispositivoIOT;
import com.grupo11.grupo11OO22023.services.IDispositivoIOTService;
import com.grupo11.grupo11OO22023.services.implementation.DispositivoIOTService;

import helpers.ViewRouteHelper;

@RestController
@RequestMapping("/dispositivo")
public class DispositivoIOTController {
	
	@Autowired
	@Qualifier("dispositivoIOTService")
	private IDispositivoIOTService dispositivoIOTService;
	
	@GetMapping("/{idDispositivo}")
	public ModelAndView IdDispositivo(@PathVariable("idDispositivo") int id) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.INDEX);
		DispositivoIOT aux = new DispositivoIOTService().findById(id);
		mAV.addObject("dispositivoId", aux);
		return mAV;
	}
	
	@GetMapping("/vista")
	public ModelAndView index() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.INDEX);
		mAV.addObject("dispositivos", dispositivoIOTService.getAll());
		mAV.addObject("string", new String());
		return mAV;
	}
	
	
}
