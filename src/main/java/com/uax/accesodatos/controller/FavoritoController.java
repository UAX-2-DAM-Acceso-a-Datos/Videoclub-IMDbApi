package com.uax.accesodatos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uax.accesodatos.dto.FavoritosDto;
import com.uax.accesodatos.dto.PeliculasDto;
import com.uax.accesodatos.repository.FavoritosRepository;
import com.uax.accesodatos.repository.PeliculasRepository;
import com.uax.accesodatos.services.PeliculaService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class FavoritoController {
	@Autowired
	private FavoritosRepository favrepository;
	@Autowired
	private PeliculaService peliculasService;
	@Autowired
	private PeliculasRepository peliculasRepository;
	
	@GetMapping("/goToFavoritos")
	public String goToFavoritos(@RequestParam("id")String id ,Model model , HttpServletRequest hp ) {
		
		String username = hp.getUserPrincipal().getName();// Obtener el usuario
		String id_pelicula=id;
		FavoritosDto fav = new FavoritosDto(username,id_pelicula);
		favrepository.addFavorito(fav);
		peliculasService.getResponseById(id_pelicula);
		//Mostrar peliculas:
		List<PeliculasDto> peliculasfav= new ArrayList<>();
		peliculasfav=peliculasRepository.getPeliculasId(username);
		//Pasamos el model con la informacion de las peliculas guardadas en base de datos
		model.addAttribute("peliculas",peliculasfav);
	
		
		
		
		return "favoritos";
	}
	
	
	@GetMapping("/Favoritos")
	public String goToFavoritos(Model model) {
		
		
		return "favoritos";
	}
	
	
	
	
}
