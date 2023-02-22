package com.uax.accesodatos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.uax.accesodatos.dto.UsuarioDto;
import com.uax.accesodatos.services.UsuarioService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class PerfilController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping("/perfil")
	public String getPerfil(Model model, HttpServletRequest http) {
		
		UsuarioDto usuario = usuarioService.getPerfilUser(http.getUserPrincipal().getName());
		
		model.addAttribute("usuario",usuario);
		model.addAttribute("userName", http.getUserPrincipal().getName());
		
		
		return "/views/perfil";
	}

	@PostMapping("/perfil")
	public String getPerfil(@ModelAttribute("usuario") UsuarioDto usuario, HttpServletRequest http) {
		usuario.setUsername(http.getUserPrincipal().getName());
		usuarioService.updatePerfilUser(usuario);
		
		return "redirect:/perfil";
	}
	
}
