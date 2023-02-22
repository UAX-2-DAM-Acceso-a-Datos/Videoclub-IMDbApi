package com.uax.accesodatos.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uax.accesodatos.dto.ResponseBuscadorDto;
import com.uax.accesodatos.services.PeliculaService;

@Controller
public class BuscadorController {
	@Autowired 
	private PeliculaService peliculaService;
	
	
	@GetMapping("/gotoBuscadorTitulo")
	public String gotoBuscadorTiulo(Model model, @RequestParam("titulo") String titulo) {
		
		model.addAttribute("peliculas",peliculaService.getpeliculaByTitulo(titulo));
		return "buscador";
		
	}
	@GetMapping("/gotoBuscador")
	public String gotoBuscador() {
		return "buscador";
		
	}

}
