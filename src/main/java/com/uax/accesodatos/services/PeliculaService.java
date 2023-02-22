package com.uax.accesodatos.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.uax.accesodatos.dto.ListaRankingResponseDto;
import com.uax.accesodatos.dto.ListaResponseBuscadorDto;
import com.uax.accesodatos.dto.PeliculasDto;
import com.uax.accesodatos.dto.RankingResponseDto;
import com.uax.accesodatos.dto.ResponseBuscadorDto;
import com.uax.accesodatos.dto.peliculasresponsedto.PeliculasResponseDto;
import com.uax.accesodatos.repository.PeliculasRepository;

@Service
public class PeliculaService {
	@Autowired
	public PeliculasRepository repository;
	
	@Autowired
	TrailerService trailerService;
	

	private final String uricallPelicula = "https://imdb-api.com/en/API/SearchMovie/k_4yy73lat/";
	String uricallTitulo="https://imdb-api.com/en/API/SearchTitle/k_k8y80mxd/";
	private RestTemplate resT = new RestTemplate(); // Objeto que permite hacer llamadas de API
	private String result;

	public PeliculasDto getInfoPelicula(PeliculasDto pelicula) {
		String uricall = uricallPelicula + pelicula.getId();
		result = resT.getForObject(uricall, String.class); // Llamada a la API que devuelve un String

		return getResponseByString(result);
	}

	public PeliculasDto getResponseByString(String result) {
		Gson gson = new Gson();// GSON clase
		PeliculasDto pelicula=gson.fromJson(result, PeliculasDto.class);// Convierte la respuesta de la API en un objeto
		repository.savePeliculas(pelicula);
		return pelicula;
				
	}
	
	
	// Get pelicula by Id
	public boolean getResponseById(String id) {
		Gson gson = new Gson(); // Variable Gson para formatear de JSON a Object
		PeliculasDto pelicula = new PeliculasDto();
		
		try {
			String uricallById = "https://imdb-api.com/en/API/Title/k_4yy73lat/"+ id; // Uri para sacar todos los datos de una pelicula en concreto,
			
			result = resT.getForObject(uricallById, String.class); // Resultado obtenido de la llamada api
			PeliculasResponseDto peliculaResponse = gson.fromJson(result, PeliculasResponseDto.class); // Convierte el JSON en PeliculaResponseDto
			
			
			// Pasar los datos de la respuesta al Objeto pelicula.
			pelicula.setId(peliculaResponse.getId());
			pelicula.setImagen(peliculaResponse.getImage());
			pelicula.setImDbRating(peliculaResponse.getImDbRating());
			pelicula.setPegi(peliculaResponse.getContentRating());
			pelicula.setPlot(peliculaResponse.getPlot().replace("'", " "));
			pelicula.setRuntimeStr(peliculaResponse.getRuntimeStr());
			pelicula.setTitulo(peliculaResponse.getTitle());
			pelicula.setTrailer(trailerService.gettrailerbyid(id));
			
			repository.savePeliculas(pelicula);
		}catch(Exception e) {
			e.getMessage();
			return false;
		}

		
		
		return true;
	}

	public ArrayList<ResponseBuscadorDto> getpeliculaByTitulo(String titulo) {
		String uricall=uricallTitulo+titulo;

		result = resT.getForObject(uricall, String.class); // Llamada a la API que devuelve un String

		return getResponseByTitulo(result).getResults();

	}
	public ListaResponseBuscadorDto getResponseByTitulo(String result) {
		Gson gson = new Gson();// GSON clase
		return gson.fromJson(result, ListaResponseBuscadorDto.class);// Convierte la respuesta de la API en un objeto
	}
	

}
