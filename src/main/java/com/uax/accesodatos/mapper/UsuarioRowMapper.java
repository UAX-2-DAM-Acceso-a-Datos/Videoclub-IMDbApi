package com.uax.accesodatos.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.uax.accesodatos.dto.UsersDto;
import com.uax.accesodatos.dto.UsuarioDto;

public class UsuarioRowMapper  implements RowMapper<UsuarioDto>{

	@Override
	public UsuarioDto mapRow(ResultSet rs, int rowNum) throws SQLException {

		UsuarioDto usuario = new UsuarioDto();
		usuario.setUsername(rs.getString(1));
		usuario.setTlf(rs.getString(2));
		usuario.setEmail(rs.getString(3));
		usuario.setFecNac(rs.getDate(4));
		
		return usuario;
	}
	
	

}
