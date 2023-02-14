package com.uax.accesodatos.Interface;

import com.uax.accesodatos.dto.UsersDto;

public interface UsuarioInterface {

	public UsersDto findByUsername(String username);
	
}
