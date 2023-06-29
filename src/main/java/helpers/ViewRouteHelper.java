package helpers;

public class ViewRouteHelper {

	//Views
	
	//Lugar
	public final static String LUGAR_INDEX = "lugar/index";
	public final static String LUGAR_FORMULARIO = "lugar/formulario";
	public final static String LUGAR_NUEVO = "lugar/nuevo";
	public final static String LUGAR_EDITAR = "lugar/editar";
	public final static String LIST_LUGARES = "/lugares";

	
	//Redirects
	
	public final static String LUGAR_ROOT = "/lugar/index";
	//Dispositivo Riego Automatico
	public final static String RIEGO_INDEX = "riegoAutomatico/index";
	public final static String DISPOSITIVO_RIEGO_ROOT = "/riegoAutomatico/index";
	public final static String DISPOSITIVO_RIEGO_NUEVO= "/riegoAutomatico/nuevo";
	public final static String RIEGOAUTOMATICOS= "/riegoAutomatico/listaRiegos";

	// ERROR
		public final static String ERROR_403="error/403";
	
	// HOME
		public final static String HOME_INDEX = "home/index";
		public final static String HOME_LOGIN = "home/login";
		public final static String HOME_LOGOUT = "home/logout";
		public final static String HOME_ABOUT_US = "home/about-us";
		public final static String HOME_USER = "home/user";
	
		
	//PROFILE
		public final static String PERFILES = "profile/listaPerfiles";
		public final static String PROFILE_FORM = "profile/form";
		
	// REDIRECT
		public final static String HOME_ROUTE = "redirect:/";
		public final static String ROUTE_PERFILES = "redirect:/perfil/listarPerfil";
		public final static String USUARIO_ROOT = "redirect:/usuario";
		
	// USER
		public final static String USUARIOS = "usuario/listaUsuarios";
		public final static String USUARIO_FORM = "usuario/form";
		
	

}

