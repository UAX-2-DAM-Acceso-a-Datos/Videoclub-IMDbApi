package com.uax.accesodatos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.uax.accesodatos.dto.UsersDto;

@Controller
public class UserController {
	@Autowired
	private JdbcUserDetailsManager jdbcUserDetailsManager;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@PostMapping(value = "/registrarUsuario")
	public String register(@RequestBody UsersDto myUser) {
		List<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority(myUser.getRoles()));

//		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//		authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
//		Authentication authentication = new UsernamePasswordAuthenticationToken(myUser.getUserName(), myUser.getPassword(), authorities);
//		SecurityContextHolder.getContext().setAuthentication(authentication);
//		

		String encodededPassword = bCryptPasswordEncoder.encode(myUser.getPassword());

		User user = new User(myUser.getUserName(), encodededPassword, authorities);

		jdbcUserDetailsManager.createUser(user);

		return "redirect:/go-to-login";
	}

}
