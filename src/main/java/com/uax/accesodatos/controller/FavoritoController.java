package com.uax.accesodatos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.uax.accesodatos.dto.FavoritosDto;
import com.uax.accesodatos.repository.FavoritosRepository;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class FavoritoController {
	@Autowired
	private FavoritosRepository favrepository;
	
	@GetMapping("/goToFavoritos")
	public String goToFavoritos(Model model , HttpServletRequest hp ) {
		FavoritosDto favorito = new FavoritosDto();
		favorito.getUsername();
		//System.out.println("klk esto va");
		
		return "favoritos";
	}
	
	@GetMapping("/goToIndex")
	public String goToIndex(HttpServletRequest hp) {
		
		return "index";
	}
	
	@GetMapping("/goToPopulares")
	public String goToPopulares(HttpServletRequest hp) {
		
		return "populares";
	}
	
	
}
