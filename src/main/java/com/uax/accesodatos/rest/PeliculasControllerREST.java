package com.uax.accesodatos.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uax.accesodatos.dto.PeliculasDto;
import com.uax.accesodatos.repository.PeliculasRepository;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RequestMapping("/api")
@RestController
public class PeliculasControllerREST {

	@Autowired
	PeliculasRepository peliculasRepository;
	

	@ApiResponse(responseCode = "404",description = "No se ha encontrado la pelicula")
	@Operation(summary = "Obtiene todas las peliculas")
	@GetMapping("/peliculas")
	public List<PeliculasDto> getAllPeliculas(){
		return peliculasRepository.getAllPeliculas();
	}
	

	@ApiResponse(responseCode = "400",description = "Alguno de los campos no es correcto")
	@Operation(summary = "Guarda una pelicula")
	@PostMapping("/peliculas")
	public boolean savePeliculas(@RequestBody PeliculasDto p) {
		
		
		peliculasRepository.savePeliculas(p);
		return true;
	}
	
}
