package com.uax.accesodatos.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.uax.accesodatos.dto.PeliculasDto;
import com.uax.accesodatos.mapper.PeliculasRowMapper;

public class PeliculasRepository {

	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<PeliculasDto> getAllPeliculas(){
		return jdbcTemplate.query("SELECT *  FROM peliculas", new PeliculasRowMapper());
	}
	
	public  boolean savePeliculas(PeliculasDto peliculas) {
		
		try {
			String sql=String.format("INSERT INTO Peliculas VALUES('%s','%s','%s','%s','%s','%s','%s','%s')",
					peliculas.getId(),peliculas.getTitulo(),peliculas.getPlot(),peliculas.getImagen(),peliculas.getImDbRating(),
					peliculas.getTrailer(),peliculas.getRuntimeStr(),peliculas.getPegi());
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return true;
		
	}
}
