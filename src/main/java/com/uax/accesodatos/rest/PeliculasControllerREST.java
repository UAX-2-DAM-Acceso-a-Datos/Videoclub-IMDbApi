package com.uax.accesodatos.rest;

import java.beans.Statement;
import java.sql.PreparedStatement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Cache.Connection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uax.accesodatos.dto.PeliculasDto;
import com.uax.accesodatos.repository.PeliculasRepository;
import com.uax.accesodatos.services.PeliculaService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RequestMapping("/api")
@RestController
public class PeliculasControllerREST {

	@Autowired
	PeliculasRepository peliculasRepository;
	
	
	Statement statement=null;
	PreparedStatement PST=null;
	Connection connection = null;
	PeliculasDto pelicula=null;  
	

	@ApiResponse(responseCode = "404",description = "No se ha encontrado la pelicula")
	@Operation(summary = "Obtiene todas las peliculas")
	@GetMapping("/peliculas")
	public List<PeliculasDto> getAllPeliculas(){
		
		List<PeliculasDto> b = peliculasRepository.getAllPeliculas();
	
		return b;
	
		//return peliculasRepository.getAllPeliculas();
	}
	
	@ApiResponse(responseCode = "404",description = "No se ha encontrado la pelicula")
	@Operation(summary = "Obtiene las peliculas de reservas")
	@GetMapping("/peliculasbyReservas/id/{id}")
	public PeliculasDto getPeliculasFromReservas(@PathVariable(name = "id") String id){
		
		PeliculaService b= new PeliculaService();
		PeliculasDto a= b.getResponseById(id);
		
		
		return a;

	}
	
	
	@ApiResponse(responseCode = "404",description = "No se ha encontrado la pelicula")
	@Operation(summary = "Obtiene las peliculas de favoritos")
	@GetMapping("/peliculasbyFavoritos/nombre/{nombre}")
	public List<PeliculasDto> getPeliculasFromFavoritos(@PathVariable(name = "nombre") String nombre){
		
		List<PeliculasDto> b = peliculasRepository.getFavoritosById(nombre);
		
		return b;

	}
	
	@ApiResponse(responseCode = "404",description = "No se ha encontrado la pelicula")
	@Operation(summary = "Obtiene las peliculas por Id")
	@GetMapping("/peliculasbyId/id/{id}")
	public PeliculasDto getPeliculasById(@PathVariable(name = "id")String id) {
	PeliculaService a=new PeliculaService();
	
		PeliculasDto pelicula=a.getResponseById(id);
		
		return pelicula;
		}
	
	
}
