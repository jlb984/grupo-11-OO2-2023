 package com.grupo11.grupo11OO22023.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.grupo11.grupo11OO22023.entities.Lugar;
import com.grupo11.grupo11OO22023.models.LugarModel;
import com.grupo11.grupo11OO22023.services.ILugarService;
import helpers.ViewRouteHelper;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/lugar")
public class LugarController {
	
	@Autowired
	@Qualifier("lugarService")
	private ILugarService lugarService;
	
	private ModelMapper modelMapper = new ModelMapper();
	
	@GetMapping("/")
	public RedirectView root() {
		return new RedirectView(ViewRouteHelper.LUGAR_ROOT);
	}
	
	@GetMapping("")
	public RedirectView root2() {
		return new RedirectView(ViewRouteHelper.LUGAR_ROOT);
	}

	@GetMapping("/index")
	public ModelAndView index() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.LUGAR_INDEX);
		mAV.addObject("lugares", lugarService.getAll());
		mAV.addObject("lugar", new LugarModel());
		mAV.addObject("string", new String());
		return mAV;
	}
	
	
	@GetMapping("/{idLugar}")
	public ModelAndView lugarId(@PathVariable("idLugar") int idLugar) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.LUGAR_EDITAR);
		mAV.addObject("lugar", lugarService.findById(idLugar));
		return mAV;
	}
	
	@PostMapping("/editar")
	public RedirectView update(@ModelAttribute("lugar") LugarModel lugarModel) {
		Lugar lugar = modelMapper.map(lugarModel, Lugar.class);
		if(lugarModel.getIdLugar() > 0) {
			Lugar lugarOriginal = lugarService.findById(lugarModel.getIdLugar());
			lugar.setNombreLugar(lugarOriginal.getNombreLugar());
			lugar.setCiudad(lugarOriginal.getCiudad());
			lugar.setPosicionGPS(lugarOriginal.getPosicionGPS());
		}
		lugarService.insertOrUpdate(modelMapper.map(lugarModel, Lugar.class));
		return new RedirectView(ViewRouteHelper.LUGAR_ROOT);
	}
	
	@GetMapping("/nombre/{nombre}")
	public ModelAndView traerPorNombre(@PathVariable("nombre") String nombre) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.LUGAR_INDEX);
		mAV.addObject("lugares", lugarService.findByNombreLugar(nombre));
		mAV.addObject("lugar", new LugarModel());
		return mAV;
	}


	@GetMapping("/formulario")
	public ModelAndView nuevoLugar() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.LUGAR_FORMULARIO);
		mAV.addObject("lugar", new LugarModel());
		return mAV;
	}


	@PostMapping("/nuevo")
	public RedirectView nuevoLugar(@Valid @ModelAttribute("lugar") LugarModel lugarModel, BindingResult bindingResult) {
		lugarService.insertOrUpdate(modelMapper.map(lugarModel, Lugar.class));
		return new RedirectView(ViewRouteHelper.LUGAR_ROOT);
	}


}
