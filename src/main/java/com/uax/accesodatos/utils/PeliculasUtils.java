package com.uax.accesodatos.utils;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PeliculasUtils {
	@Value("${api.key}")
	private String apiKey;
	
	public String getResponseToAPIPeliculas(String uri) throws IOException, InterruptedException {
		
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(uri))
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		
		return response.body();
	}
}
