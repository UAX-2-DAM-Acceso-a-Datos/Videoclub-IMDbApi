package com.uax.accesodatos.dto;

public class UsersDto {
	private String userName;
	private String password;
	private String roles;
	private String telefono;
	private String email;
	private String FecNac;
	
	
	public UsersDto(String userName, String password, String roles) {
		this.userName = userName;
		this.password = password;
		this.roles = roles;
	}
	
	public UsersDto(String userName, String telefono, String email, String fecNac) {
		this.userName = userName;
		this.telefono = telefono;
		this.email = email;
		this.FecNac= fecNac;
	}

	public UsersDto() {
		
	}
	// Getters y Setters
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getFecNac() {
		return FecNac;
	}

	public void setFecNac(String fecNac) {
		FecNac = fecNac;
	}
	
	
	
}
