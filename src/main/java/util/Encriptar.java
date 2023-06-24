package util;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;


public class Encriptar {
	private BCryptPasswordEncoder passwordEncoder;

	protected Encriptar() {
		passwordEncoder = new BCryptPasswordEncoder();
	}

	public String encode(String string) {
		return passwordEncoder.encode(string);
	}

	public boolean estaEncriptada(String string) {
		String pattern = "^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(pattern);
		return m.find();
	}

}