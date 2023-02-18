package com.uax.accesodatos.repository;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uax.accesodatos.dto.PeliculasDto;
import com.uax.accesodatos.mapper.PeliculasRowMapper;

@Repository
public class PeliculasRepository {

	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public List<PeliculasDto> getAllPeliculas(){
		//query obtener todas las peliculas
		return jdbcTemplate.query("SELECT *  FROM peliculas", new PeliculasRowMapper());
	}
	
	public   boolean savePeliculas(PeliculasDto peliculas) {
		
		try {
			String sql=String.format("INSERT INTO peliculas VALUES('%s','%s','%s','%s','%s','%s','%s','%s')",
					peliculas.getId(),peliculas.getTitulo(),peliculas.getPlot(),peliculas.getImagen(),peliculas.getImDbRating(),
					peliculas.getTrailer(),peliculas.getRuntimeStr(),peliculas.getPegi());
			
			jdbcTemplate.execute(sql);
			
		} catch (Exception e) {
			e.getMessage();
			return false;
		}
		return true;
		
	}
}
