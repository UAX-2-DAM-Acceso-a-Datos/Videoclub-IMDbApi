package com.uax.accesodatos.dto;

public class GenerosDto {

	private int Id;
	private String genero;
	
	public GenerosDto(int Id,String genero) {
		
		this.Id=Id;
		this.genero=genero;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
}
