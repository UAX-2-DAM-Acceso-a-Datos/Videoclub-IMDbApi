package com.uax.accesodatos.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.uax.accesodatos.dto.FavoritosDto;

public class FavoritosMapper implements RowMapper<FavoritosDto> {
	// Mapper de la clase FavoritosDto para pasarselo al controller
	@Override
	public FavoritosDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		// Creamos un objeto para poder mapearlo
		FavoritosDto pelicula = new FavoritosDto();
		// Le asiganmos al id de el usuario el id que recoge el mapper
		pelicula.setId_usuario(rs.getInt(1));
		// Le asiganmos al id de la pelicula el id que recoge el mapper
		pelicula.setId(rs.getString(2));
		// Devolvemos pelicula con los valores ya cargados
		return pelicula;
	}

}
