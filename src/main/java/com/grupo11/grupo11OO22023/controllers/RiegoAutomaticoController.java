package com.grupo11.grupo11OO22023.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.grupo11.grupo11OO22023.services.implementation.RiegoAutomaticoService;

import helpers.ViewRouteHelper;


@Controller
@RequestMapping("/riegoAutomatico")
public class RiegoAutomaticoController {
	 
	@Autowired
	@Qualifier("riegoAutomaticoService")
	private RiegoAutomaticoService riegoAutomaticoService;
	
	@GetMapping("/listaRiegos")
	public ModelAndView index() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.RIEGOAUTOMATICOS);
		mAV.addObject("riegoAutomaticos", riegoAutomaticoService.traerRiegosAutomaticos());
		return mAV;
	}
	
	
	
	
	
}
