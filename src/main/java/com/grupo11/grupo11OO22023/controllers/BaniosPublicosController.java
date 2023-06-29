package com.grupo11.grupo11OO22023.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.grupo11.grupo11OO22023.entities.BaniosPublicos;
import com.grupo11.grupo11OO22023.services.implementation.BaniosPublicosService;


@RestController
@RequestMapping("/dispositivoiot")
public class BaniosPublicosController {

	@Autowired
	private BaniosPublicosService baniosPublicosService;

	@GetMapping
	public List<BaniosPublicos> getBaniosPublicos() {
		return this.baniosPublicosService.lstBaniosPublicos();
	}

	@PostMapping
	public BaniosPublicos saveBaniosPublicos(@RequestBody BaniosPublicos baniosPublicos) {
		return baniosPublicosService.saveBaniosPublicos(baniosPublicos);
	}

}
