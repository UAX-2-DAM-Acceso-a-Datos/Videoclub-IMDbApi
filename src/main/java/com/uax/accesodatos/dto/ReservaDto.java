package com.uax.accesodatos.dto;

public class ReservaDto {

	private String id;
	private String usuario;
	private String fech_ini;
	private String fech_fin;
	private String precio;
	private String pagado;
	private String estado;

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
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
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
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