package com.uax.accesodatos.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.uax.accesodatos.dto.UsersDto;

public class UsuarioRowMapper implements RowMapper<UsersDto>{

	@Override
	public UsersDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		//creacion del controller
		UsersDto user = new UsersDto();
		//Asignacion del atributo al objeto
		user.setUserName(rs.getString(1));
		//Asignacion del atributo al objeto
		user.setPassword(rs.getString(2));
		//Asignacion del atributo al objeto
		user.setRoles(rs.getString(3));
		//Asignacion del atributo al objeto
		user.setEmail(rs.getString(4));
		//Asignacion del atributo al objeto
		user.setTelefono(rs.getString(5));
		//Asignacion del atributo al objeto
		user.setFecNac(rs.getString(6));
		
		return user;
	}
	

	
}
