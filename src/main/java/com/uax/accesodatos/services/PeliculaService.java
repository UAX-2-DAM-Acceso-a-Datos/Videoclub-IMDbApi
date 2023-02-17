package com.uax.accesodatos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.uax.accesodatos.dto.PeliculasDto;
import com.uax.accesodatos.repository.PeliculasRepository;

@Service
public class PeliculaService {
	@Autowired
	public PeliculasRepository repository;

	private final String uricallPelicula = "https://imdb-api.com/en/API/SearchMovie/k_4yy73lat/";
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

}
