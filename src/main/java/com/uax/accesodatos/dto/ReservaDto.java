package com.uax.accesodatos.dto;

public class ReservaDto {

	private String id;
	private String username;
	private String fech_ini;
	private String fech_fin;
	private double precio;
	private String pagado;
	private String estado;

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsuario() {
		return username;
	}
	public void setUsuario(String username) {
		this.username = username;
	}
	public String getFech_ini() {
		return fech_ini;
	}
	public void setFech_ini(String fech_ini) {
		this.fech_ini = fech_ini;
	}
	public String getFech_fin() {
		return fech_fin;
	}
	public void setFech_fin(String fech_fin) {
		this.fech_fin = fech_fin;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getPagado() {
		return pagado;
	}
	public void setPagado(String pagado) {
		this.pagado = pagado;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
