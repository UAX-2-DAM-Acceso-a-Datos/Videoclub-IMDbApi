package com.uax.accesodatos.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uax.accesodatos.Interface.UsuarioInterface;
import com.uax.accesodatos.dto.UsersDto;
import com.uax.accesodatos.dto.UsuarioDto;
import com.uax.accesodatos.mapper.UsersRowMapper;
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
			return jdbctemplate.queryForObject(sql, new UsersRowMapper());
			
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
			return jdbctemplate.queryForObject(sql, new UsersRowMapper());
			
		}catch(Exception e) {
			return null;
		}
		
	}
	@Override
	public boolean UserInUsuario(String username) {
		try {
			String sql = String.format("INSERT INTO usuario (username, telefono, email, fechNac) VALUES ('%s', '', '', NULL);",username);
			jdbctemplate.execute(sql);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	@Override
	public UsuarioDto getPerfilUser(String username) {

		UsuarioDto usuario = null;
		try {
		String sql = String.format("SELECT username, telefono, email, fechNac FROM usuario WHERE username='%s'", username);
		usuario = jdbctemplate.queryForObject(sql, new UsuarioRowMapper());
		}catch(Exception e) {
			e.getMessage();
		}
		
		return usuario;
	}
	
	@Override
	public boolean updatePerfil(UsuarioDto usuario) {

		try {
			String sql = String.format("UPDATE usuario SET username='%s', telefono='%s', email='%s', fechNac='%s' WHERE username='%s'", usuario.getUsername(), usuario.getTlf(), usuario.getEmail()
					, usuario.getFecNac(), usuario.getUsername());
			jdbctemplate.execute(sql);
			
		}catch(Exception e) {
			e.getMessage();
			return false;
		}
		
		
		return true;
	}
	
	
	

	
}
