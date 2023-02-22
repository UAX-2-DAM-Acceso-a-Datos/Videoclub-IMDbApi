package com.uax.accesodatos.dto;

import java.sql.Date;

public class UsuarioDto {

	private String username;
	private String tlf;
	private String email;
	private Date fecNac;
	
	public UsuarioDto() {
		
	}
	
	public UsuarioDto(String username, String tlf, String email, Date fecNac) {
		this.username = username;
		this.tlf = tlf;
		this.email = email;
		this.fecNac = fecNac;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTlf() {
		return tlf;
	}
	public void setTlf(String tlf) {
		this.tlf = tlf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getFecNac() {
		return fecNac;
	}
	public void setFecNac(Date fecNac) {
		this.fecNac = fecNac;
	}
	
	
	
}
