package com.uax.accesodatos.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.uax.accesodatos.dto.TrailerResponseDto;

@Service
public class TrailerService {
	
	private final String uricallTop250 = "https://imdb-api.com/en/API/Trailer/k_4yy73lat/";
	private RestTemplate resT = new RestTemplate(); // Objeto que permite hacer llamadas de API
	private String result;
	
	public String gettrailerbyid(String id) {

		result = resT.getForObject(uricallTop250+id, String.class); // Llamada a la API que devuelve un String

		return getResponseByString(result).getLinkEmbed();

	}
	
	public TrailerResponseDto getResponseByString(String result) {
		Gson gson = new Gson();// GSON clase
		return gson.fromJson(result, TrailerResponseDto.class);// Convierte la respuesta de la API en un objeto
	}

}
