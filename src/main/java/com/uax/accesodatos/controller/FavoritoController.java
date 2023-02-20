package com.uax.accesodatos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uax.accesodatos.dto.FavoritosDto;
import com.uax.accesodatos.repository.FavoritosRepository;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class FavoritoController {
	@Autowired
	private FavoritosRepository favrepository;
	
	@GetMapping("/goToFavoritos")
	public String goToFavoritos(@RequestParam("id")String id ,Model model , HttpServletRequest hp ) {
		
		String username = hp.getUserPrincipal().getName();// Obtener el usuario
		String id_pelicula=id;
		FavoritosDto fav = new FavoritosDto(username,id_pelicula);
		favrepository.addFavorito(fav);
		
		//Mostrar peliculas:
		
		return "favoritos";
	}
	
	
	@GetMapping("/Favoritos")
	public String goToFavoritos(Model model) {
		
		
		return "favoritos";
	}
	
	
	
	
}
