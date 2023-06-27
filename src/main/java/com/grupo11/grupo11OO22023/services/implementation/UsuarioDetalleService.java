package com.grupo11.grupo11OO22023.services.implementation;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.grupo11.grupo11OO22023.entities.Usuario;
import com.grupo11.grupo11OO22023.repositories.IUsuarioRepository;


@Service("userDetailsService") // Importante respetar el nombre e implementar de UserDetailsService
public class UsuarioDetalleService implements UserDetailsService {
	
	@Autowired
	private IUsuarioRepository repository;

	@Override
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario user = repository.findByUserName(username); // Verifica si existe en la BD
		
		if(user == null) throw new UsernameNotFoundException("User not found: " + user);
		
		var roles = new ArrayList<GrantedAuthority>(); // Spring solicita que el objeto sea del tipo: GrantedAuthority
		
		roles.add(new SimpleGrantedAuthority(user.getRol().getName()));		
		
		return new User(user.getUserName(), user.getPassword(), user.isEnabled(), true, true, true, roles); // User es una clase de Spring Segurity		 
	}
}
