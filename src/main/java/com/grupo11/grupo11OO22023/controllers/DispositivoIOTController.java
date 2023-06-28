package com.grupo11.grupo11OO22023.controllers;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.grupo11.grupo11OO22023.entities.DispositivoIOT;
import com.grupo11.grupo11OO22023.models.LugarModel;
import com.grupo11.grupo11OO22023.services.implementation.DispositivoIOTService;

import helpers.ViewRouteHelper;

@RestController
@RequestMapping("/index")
public class DispositivoIOTController {
	
	@GetMapping("/{idDispositivo}")
	public ModelAndView IdDispositivo(@PathVariable("idDispositivo") int id) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.HOME_INDEX);
		DispositivoIOT aux = new DispositivoIOTService().findById(id);
		mAV.addObject("dispositivoId", aux);
		return mAV;
	}
	
	@GetMapping("/vista")
	public ModelAndView index() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.HOME_INDEX);
		List<DispositivoIOT> aux = new DispositivoIOTService().getAll();
		mAV.addObject("dispositivos", aux );
		mAV.addObject("lugar", new LugarModel());
		mAV.addObject("string", new String());
		return mAV;
	}
}
