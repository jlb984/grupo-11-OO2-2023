package com.grupo11.grupo11OO22023.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import helpers.ViewRouteHelper;

@RestController
@RequestMapping("/agregar")
public class AgregarDispositivoController {

	
	@GetMapping(value="/agregarr")
	public ModelAndView agregar() {//el nombre nada que ver
		ModelAndView modelAndView = new ModelAndView(ViewRouteHelper.HOME_AGREGAR);
		return modelAndView;
	}
	
}
