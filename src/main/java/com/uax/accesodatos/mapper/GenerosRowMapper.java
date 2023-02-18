package com.uax.accesodatos.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.uax.accesodatos.dto.GenerosDto;

public class GenerosRowMapper {

	
	public GenerosDto mapRow(ResultSet rs,int rowNum) throws SQLException {
		//Creación del objeto
		GenerosDto genero= new GenerosDto(rowNum, null);
		//Asignacion del atributo al objeto
		genero.setId(rs.getInt(0));
		//Asignacion del atributo al objeto
		genero.setGenero(rs.getString(1));
		
		//Retorno de pelicula
		return genero;
		
		
		
	}
}
