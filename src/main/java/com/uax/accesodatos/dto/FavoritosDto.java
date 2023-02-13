package com.uax.accesodatos.dto;

public class FavoritosDto {

	private String username;
	private String id;

	public FavoritosDto(String username, String id) {
		this.username =username;
		this.id = id;
	}

	public FavoritosDto() {
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "FavoritosDto [username=" + username + ", id=" + id + "]";
	}

}
