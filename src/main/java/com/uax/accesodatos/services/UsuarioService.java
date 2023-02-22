package com.uax.accesodatos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uax.accesodatos.dto.UsuarioDto;
import com.uax.accesodatos.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	public UsuarioDto getPerfilUser(String username) {
		
		UsuarioDto usuario = usuarioRepository.getPerfilUser(username);
		
		return usuario;
	}
	
	public boolean updatePerfilUser(UsuarioDto usuario) {
		
		return usuarioRepository.updatePerfil(usuario);	
	}
	
}
