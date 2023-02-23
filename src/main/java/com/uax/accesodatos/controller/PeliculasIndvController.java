package com.uax.accesodatos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uax.accesodatos.services.PeliculaService;
@Controller
public class PeliculasIndvController {

	@Autowired
	PeliculaService peliculasservices;
	
	@GetMapping("/PeliculaIndv")
	public String PeliculaIndv(Model model, @RequestParam("id") String id) {
		
		model.addAttribute("peliculas",peliculasservices.getpeliculaByTitulo(id));
		
		return "/views/PeliculaIndv.html";
		
	}
}
