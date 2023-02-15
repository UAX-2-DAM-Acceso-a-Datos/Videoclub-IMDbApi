package com.uax.accesodatos.dto;

public class PeliculasGenerosDto {

	private int id_genero;
	private String id_pelicula;
	
	public PeliculasGenerosDto(int id_genero,String id_pelicula) {
		this.id_genero=id_genero;
		this.id_pelicula=id_pelicula;	
	}

	public int getId_genero() {
		return id_genero;
	}

	public void setId_genero(int id_genero) {
		this.id_genero = id_genero;
	}

	public String getId_pelicula() {
		return id_pelicula;
	}

	public void setId_pelicula(String id_pelicula) {
		this.id_pelicula = id_pelicula;
	}
	
	
}
