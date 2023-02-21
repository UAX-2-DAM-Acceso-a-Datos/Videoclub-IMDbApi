package com.uax.accesodatos.Interface;

import com.uax.accesodatos.dto.UsersDto;

public interface UsuarioInterface {
	public boolean UserInUsuario(String username);//hacer la foranea
	public UsersDto findByUsername(String username);//obtener un usuario
	public UsersDto findInfoUsuario(String username);//obtener mail y telf
	
}
