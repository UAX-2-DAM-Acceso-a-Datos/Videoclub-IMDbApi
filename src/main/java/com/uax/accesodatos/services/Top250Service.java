package com.uax.accesodatos.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.uax.accesodatos.dto.ListaRankingResponseDto;
import com.uax.accesodatos.dto.RankingResponseDto;

@Service
public class Top250Service {

	private final String uricallTop250 = "https://imdb-api.com/en/API/MostPopularMovies/k_j8vsya70";
	private RestTemplate resT = new RestTemplate(); // Objeto que permite hacer llamadas de API
	private String result;

	public ArrayList<RankingResponseDto> getmostPopular() {

		result = resT.getForObject(uricallTop250, String.class); // Llamada a la API que devuelve un String

		return getResponseByString(result).getItems();

	}
	public ListaRankingResponseDto getResponseByString(String result) {
		Gson gson = new Gson();// GSON clase
		return gson.fromJson(result, ListaRankingResponseDto.class);// Convierte la respuesta de la API en un objeto
	}

	

}
