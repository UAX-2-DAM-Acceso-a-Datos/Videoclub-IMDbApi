package com.uax.accesodatos.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.uax.accesodatos.dto.UsersDto;

public class UsuarioRowMapper implements RowMapper<UsersDto>{

	@Override
	public UsersDto mapRow(ResultSet rs, int rowNum) throws SQLException {

		UsersDto user = new UsersDto();
		user.setUserName(rs.getString(1));
		user.setPassword(rs.getString(2));
		user.setRoles(rs.getString(3));
		
		return user;
	}
	

	
}
