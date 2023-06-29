package com.grupo11.grupo11OO22023.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import helpers.ViewRouteHelper;



@Controller
@RequestMapping("/")
public class HomeController {


	
	@GetMapping("/index")
	public ModelAndView index() {
		return new ModelAndView("/index");

	}
	
	@GetMapping("/agregar")
	public ModelAndView agregar() {
		return new ModelAndView(ViewRouteHelper.AGREGAR);
	}
	
	
	@GetMapping("/acerca-de")
	public String acerca(){
		return ViewRouteHelper.ACERCA_DE;
	}
	
}
