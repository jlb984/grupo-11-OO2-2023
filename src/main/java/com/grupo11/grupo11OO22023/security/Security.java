package com.grupo11.grupo11OO22023.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration // Clase de configuracion Spring
@EnableMethodSecurity
@EnableWebSecurity // Habilita la seguridad Web
public class Security {

	// WebSecurityConfigurerAdapter : Para configurar los usuarios que vamos a
	// utilizar

	@Autowired
	private UserDetailsService userDetailsService;

	@Autowired // Para tener disponible: AuthenticationManagerBuilder
	public void configurerGlobal(AuthenticationManagerBuilder build) throws Exception {
		build.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder()); // Encode the
																									// password
	}

	protected void configure(HttpSecurity http) throws Exception // Configura las auth (Concepto) a partir de los roles
	{

		String[] resourcesAdmin = new String[] { "/role/addRole/**", "/role/edit/**", "/role/delete", // Roles
				"/user/addUser/**", "/user/edit/**", "/user/delete", // Usuarios
				"/styles/*", "/imgs/*", "/index" // html

		};

		String[] resourcesAnyRole = new String[] { "/", "/role/roles", // Roles
				"/user/users", // Usuarios
				"dispositivo/dispositivos", // Dispositivos
				

		};

		http.authorizeHttpRequests().requestMatchers(resourcesAdmin)// /** Es para TODA ruta siguiente a esa
				.hasRole("ADMIN") // ↑↑ Quien puede acceder a estas rutas
				.requestMatchers(resourcesAnyRole) // Ingreso al inicio (publico)
				.hasAnyRole("AUDIT", "ADMIN") // ↑↑ Cualquier Usuario
				.and().formLogin() // Agrega el formulario de Login
				.loginPage("/login").defaultSuccessUrl("/index").permitAll().failureUrl("/login?error=true") // Ruta de
																												// Login
																												// y en
																												// caso
																												// de
																												// credenciales
																												// invalidas
				.and().logout().logoutUrl("/dispositivoiot").logoutSuccessUrl("/logout?logout=true") // Ruta de logout +
																										// a donde va
																										// cuando
																										// deslogea
																										// correctamente
				.deleteCookies("JSESSIONID") // Para borrar la sesion y no quede 'invalida' por defecto (para el
												// tratamiento de expired e invalid correcto)
				.and().authorizeHttpRequests().requestMatchers("/logout").anonymous() // NO queremos que un usuario
																						// logeado acceda al Logout si
																						// sigue en sesion
				.and().authorizeHttpRequests().requestMatchers("/login").anonymous() // NO queremos que un usuario
																						// logeado acceda al Login si
																						// sigue en sesion
				.and().exceptionHandling().accessDeniedPage("/error/403") // Pagina de Acceso Denegado
				.and().sessionManagement().invalidSessionUrl("/logout?expired=true"); // Cuando pase el tiempo de
																						// inactividad

	}

	public static String Encrypt(String password) // Encripta texto
	{
		return new BCryptPasswordEncoder().encode(password);
	}
}