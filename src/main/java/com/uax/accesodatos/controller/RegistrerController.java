package com.uax.accesodatos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.uax.accesodatos.dto.UsersDto;
import com.uax.accesodatos.services.CustomUserDetailsService;
@Controller

public class RegistrerController {
	@Autowired
	private JdbcUserDetailsManager jdbcUserDetailsManager;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	CustomUserDetailsService userService;
	
	@GetMapping("/pantallaRegistro")
	public String irPantallaRegistro(Model model) {
		
		return "register";
	}
	
	@PostMapping("/pantallaRegistro")
	public String registrarUsuarioWeb(@ModelAttribute("usuario") UsersDto usuario) {
		
		List<GrantedAuthority> authorities = new ArrayList<>();
		
		authorities.add(new SimpleGrantedAuthority(usuario.getRoles()));
		String encodededPassword = bCryptPasswordEncoder.encode(usuario.getPassword());

		User user = new User(usuario.getUserName(), encodededPassword, authorities);

		userService.registerUserDB(usuario);
		
		return "redirect:/go-to-login";
	}
}
