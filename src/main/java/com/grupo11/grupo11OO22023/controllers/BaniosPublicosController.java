package com.grupo11.grupo11OO22023.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.grupo11.grupo11OO22023.entities.BaniosPublicos;
import com.grupo11.grupo11OO22023.models.BaniosModel;
import com.grupo11.grupo11OO22023.services.IBaniosPublicosService;
import helpers.ViewRouteHelper;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/banios")
public class BaniosPublicosController {

	@Autowired
	@Qualifier("baniosPublicosService")
	private IBaniosPublicosService baniosPublicosService;

	private ModelMapper modelMapper = new ModelMapper();
	
	@GetMapping("")
	public RedirectView root() {
		return new RedirectView(ViewRouteHelper.BANIO_ROOT);
	}

	@GetMapping("/new")
	public ModelAndView agregar() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.BANIO_AGREGAR);
		mAV.addObject("banio", new BaniosModel());
		return mAV;
	}

	@PostMapping("/save")
	public RedirectView guardar(@Valid @ModelAttribute("banio") BaniosModel baniosModel, BindingResult bindingResult) {
		baniosPublicosService.insertOrUpdate(modelMapper.map(baniosModel, BaniosPublicos.class));
		return new RedirectView(ViewRouteHelper.AGREGAR);

	}

	@GetMapping("/vista")
	public ModelAndView vista() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.BANIO_VISTA);
		mAV.addObject("banios", baniosPublicosService.getAll());
		mAV.addObject("banio", new BaniosModel());
		mAV.addObject("string", new String());
		return mAV;
	}

}
