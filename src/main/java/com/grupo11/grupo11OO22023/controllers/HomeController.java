package com.grupo11.grupo11OO22023.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {

	@GetMapping("/index")
	public ModelAndView index() {
		return new ModelAndView("/index");
	}
	
	@GetMapping("/agregar")
	public ModelAndView agregar() {
		return new ModelAndView("/agregar");
	}
}
