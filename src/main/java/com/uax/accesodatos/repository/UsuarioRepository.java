package com.uax.accesodatos.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uax.accesodatos.Interface.UsuarioInterface;
import com.uax.accesodatos.dto.UsersDto;
import com.uax.accesodatos.mapper.UsuarioRowMapper;

@Repository
public class UsuarioRepository implements UsuarioInterface{
	
	@Autowired
	private JdbcTemplate jdbctemplate;

	@Override
	public UsersDto findByUsername(String username) {

		try {
			//obtener user de security y su authority 
			String sql = String.format("SELECT users.username, users.password, authorities.authority FROM users, authorities"
					+" WHERE users.username=authorities.username and users.username='%s'", username);
			return jdbctemplate.queryForObject(sql, new UsuarioRowMapper());
			
		}catch(Exception e) {
			return null;
		}
		
	}
	@Override
	public UsersDto findInfoUsuario(String username) {

		try {
			//obtener user de security y su authority 
			String sql = String.format("SELECT * FROM usuario"
					+" WHERE usuario.username='%s'", username);
			return jdbctemplate.queryForObject(sql, new UsuarioRowMapper());
			
		}catch(Exception e) {
			return null;
		}
		
	}

	
}
