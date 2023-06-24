package com.grupo11.grupo11OO22023.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.grupo11.grupo11OO22023.entities.Usuario;
import com.grupo11.grupo11OO22023.services.IPerfilService;
import com.grupo11.grupo11OO22023.services.IUsuarioService;

import helpers.ViewRouteHelper;
import jakarta.validation.Valid;
import models.UsuarioModel;
import util.Encriptar;

@Controller
@RequestMapping("/usuario")
public class UserController {

	@Autowired
	@Qualifier("usuarioService")
	private IUsuarioService usuarioService;
	
	@Autowired
	@Qualifier("perfilService")
	private IPerfilService perfilService;
	
	@Autowired
	private Encriptar encriptar;
	
	@GetMapping("")
	public ModelAndView index() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.USUARIOS);
		mAV.addObject("usuarios", usuarioService.traerUsuarios());
		return mAV;
	}
	
	@GetMapping("/neworupdate")
	public ModelAndView getById(@RequestParam(value= "idPersona", required=false)Usuario usuario) {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.USUARIO_FORM);
		UsuarioModel usuarioModel= null;
		
		if(usuario==null)
		{
			usuarioModel= new UsuarioModel();
			 mAV.addObject("add", true);
		} if(usuario!=null){
			usuarioModel= usuarioService.traerId(usuario.getIdPersona());	
			 mAV.addObject("add", false);
		}
		
		mAV.addObject("perfiles", perfilService.listar());
		mAV.addObject("usuario", usuarioModel);
		return mAV;
	}
	
	@PostMapping("/newUser")
	public ModelAndView saveUsuario(@Valid @ModelAttribute("usuario") UsuarioModel usuarioModel, BindingResult result,RedirectAttributes redirAttrs) {
		
		ModelAndView mAV=null;
		usuarioModel.setPassword(encriptar.encode(usuarioModel.getPassword()));
		
		UsuarioModel existente = usuarioService.findByDni(usuarioModel.getDni());
		UsuarioModel userNameRepetido = usuarioService.traerUsername(usuarioModel.getUsername());
		UsuarioModel emailRepetido=usuarioService.findByEmail(usuarioModel.getEmail());
		boolean addIncorrecto=false;
				
		if(existente!=null)
		{
			FieldError error = new FieldError("usuario", "dni", "Ya existe un usuario con el dni ingresado");
			result.addError(error);
			addIncorrecto=true;
		}
		if (result.hasErrors())	
				addIncorrecto=true;
		if(userNameRepetido!=null){
			 
		    	 FieldError error = new FieldError("usuario", "username", "Ya existe un usuario con el username ingresado");
				 result.addError(error);
				 addIncorrecto=true;
		    }
		if(emailRepetido!=null)
		    {FieldError otroError = new FieldError("usuario", "email", "El email ya tiene una cuenta asociada");
			 result.addError(otroError);
			 addIncorrecto=true;
		    }
		if(!addIncorrecto){
		    	usuarioService.insertOrUpdate(usuarioModel);
		    	redirAttrs.addFlashAttribute("success", usuarioModel.toString()+" agregado exitosamente.");
		       	mAV = new ModelAndView(ViewRouteHelper.USUARIO_ROOT);
		    }else {
		    		mAV = new ModelAndView(ViewRouteHelper.USUARIO_FORM);
		    		mAV.addObject("add", true);
		    		mAV.addObject("perfiles", perfilService.listar());}
		 return mAV;
	}
	
	@PostMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable("id") long id,RedirectAttributes redirAttrs) {
		String userName = usuarioService.traerId(id).getUsername();
		
		 Authentication auth = (Authentication) SecurityContextHolder.getContext().getAuthentication();//verificar las librerias
		    UserDetails userDetail = (UserDetails) ((org.springframework.security.core.Authentication) auth).getPrincipal();//verificar
		    UsuarioModel usuarioLog = usuarioService.traerUsername(userDetail.getUsername());
		
		 if(usuarioLog.equals(usuarioService.traerId(id))) 
			 {
			 redirAttrs.addFlashAttribute("error", "Usted no puede borrar su propia cuenta");
			 }
		 else if(!usuarioService.remove(id)) {
			redirAttrs.addFlashAttribute("error", "El usuario "+userName+" no ha podido ser dado de baja debido a registros activos");
		}else
		{
			redirAttrs.addFlashAttribute("success","El usuario "+userName+ " fue dado de baja exitosamente.");
		}
		return new ModelAndView(ViewRouteHelper.USUARIO_ROOT);
	}
	
	// ---------------------LOG IN------------------------------
			@GetMapping("/login")
			public String login(Model model,
								@RequestParam(name="error",required=false) String error,
								@RequestParam(name="logout", required=false) String logout) {
				model.addAttribute("error", error);
				model.addAttribute("logout", logout);
				return ViewRouteHelper.HOME_LOGIN;
			}

			@GetMapping("/logout")
			public String logout(Model model) {
			    return ViewRouteHelper.HOME_LOGOUT;
			}

			@GetMapping("/loginsuccess")
			public RedirectView loginCheck() {
				String ruta = "/";
				return new RedirectView(ruta);
			}
}