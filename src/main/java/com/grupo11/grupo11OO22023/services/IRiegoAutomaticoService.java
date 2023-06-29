package com.grupo11.grupo11OO22023.services;

import java.util.List;

import com.grupo11.grupo11OO22023.entities.RiegoAutomatico;
import com.grupo11.grupo11OO22023.models.RiegoAutomaticoModel;


public interface IRiegoAutomaticoService {
	
public List<RiegoAutomatico> lstRiegoAutomatico();

public List<RiegoAutomatico> getAll();

public List<RiegoAutomaticoModel> traerRiegosAutomaticos();
}