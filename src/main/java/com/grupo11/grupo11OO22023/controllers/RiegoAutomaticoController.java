package com.grupo11.grupo11OO22023.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.grupo11.grupo11OO22023.services.IRiegoAutomaticoService;

import helpers.ViewRouteHelper;

@Controller
@RequestMapping("/riegoAutomatico")
public class RiegoAutomaticoController {
	
	
	@Autowired
	@Qualifier("riegoAutomaticoService")
	private IRiegoAutomaticoService riegoAutomaticoService;
	
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView mAV= new ModelAndView(ViewRouteHelper.HOME_ABOUT_US); // cambiar el HOME_ABOUT_US
		mAV.addObject("riegoAutomatico",riegoAutomaticoService.lstRiegoAutomatico());
		mAV.addObject("riegoAutomatico",new RiegoAutomaticoModel());
	}
}
