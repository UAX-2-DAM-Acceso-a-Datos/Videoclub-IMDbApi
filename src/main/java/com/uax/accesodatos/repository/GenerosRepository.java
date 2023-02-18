package com.uax.accesodatos.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.uax.accesodatos.dto.GenerosDto;

public class GenerosRepository {

	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public boolean saveGeneros(GenerosDto genero){
		//insert genero
		String sql=String.format("INSERT INTO genero VALUES('%d','%s')", genero.getId(),genero.getGenero());
		
		return true;
		
		
	}
}
