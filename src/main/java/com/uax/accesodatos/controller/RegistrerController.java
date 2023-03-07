package com.uax.accesodatos.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.uax.accesodatos.dto.Mail;
import com.uax.accesodatos.dto.UsersDto;
import com.uax.accesodatos.repository.UsuarioRepository;
import com.uax.accesodatos.services.CustomUserDetailsService;
import com.uax.accesodatos.utils.PeliculasUtils;
import com.uax.accesodatos.utils.Tokenizer;

import jakarta.mail.MessagingException;
@Controller

public class RegistrerController {
	@Autowired
	private JdbcUserDetailsManager jdbcUserDetailsManager;
	
	@Autowired
	private PeliculasUtils peliculaUtils;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
//	@Autowired
	//private Tokenizer tokenizer;
	
	@Autowired
	CustomUserDetailsService userService;
	@Autowired
	
	UsuarioRepository usuarioRepository;
	
	@GetMapping("/pantallaRegistro")
	public String irPantallaRegistro(Model model) {
		
		return "register";
	}
	
	@PostMapping("/pantallaRegistro")
	public String registrarUsuarioWeb(@ModelAttribute("usuario") UsersDto usuario) throws Exception {
		
		List<GrantedAuthority> authorities = new ArrayList<>();
		
		authorities.add(new SimpleGrantedAuthority(usuario.getRoles()));
		String encodededPassword = bCryptPasswordEncoder.encode(usuario.getPassword());

		User user = new User(usuario.getUserName(), encodededPassword, authorities);

		userService.registerUserDB(usuario);
		
		boolean a = usuarioRepository.UserInUsuario(usuario.getUserName());
		// Formar Mail
		Mail mail = new Mail();
		mail.setTo("rafaeldijkstra@gmail.com");
		mail.setFrom("siuwy@gmail.com");
		mail.setAsunto("KLK");
		Map<String,Object> propiedades = new HashMap<>();
		propiedades.put("name",usuario.getUserName());
		propiedades.put("subscriptionDate", LocalDate.now().toString());
		propiedades.put("token", tokenizer.generateToken(usuario));
		
		mail.setProps(propiedades);
		peliculaUtils.formarMail(mail, "welcome-email");
		if (a) {
			
			return "login";
		}
		
		return"register";	
	}
	
	@GetMapping("/validarCuenta")
	public boolean validarCuenta(@RequestParam("token") String token) {
		
		
		
		System.out.println(token);
		return true;
	}
	
}
