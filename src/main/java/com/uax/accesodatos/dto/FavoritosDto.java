package com.uax.accesodatos.dto;

public class FavoritosDto {

	private int id_usuario;
	private String id;

	public FavoritosDto(int id_usuario, String id) {
		this.id_usuario = id_usuario;
		this.id = id;
	}

	public FavoritosDto() {
		// TODO Auto-generated constructor stub
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "FavoritosDto [id_usuario=" + id_usuario + ", id=" + id + "]";
	}

}
