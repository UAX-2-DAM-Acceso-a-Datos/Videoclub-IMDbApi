package com.uax.accesodatos.mapper;

import org.springframework.jdbc.core.RowMapper;

import com.uax.accesodatos.dto.PeliculasDto;

public class PeliculasRowMapper implements RowMapper<PeliculasDto>{
        
        @Override
        public PeliculasDto mapRow(java.sql.ResultSet rs, int rowNum) throws java.sql.SQLException {
                PeliculasDto pelicula = new PeliculasDto();
                pelicula.setId(rs.getString(1));
                pelicula.setTitulo(rs.getString(2));
                pelicula.setPlot(rs.getString(3));
                pelicula.setImagen(rs.getString(4));
                pelicula.setImDbRating(rs.getString(5));
                pelicula.setTrailer(rs.getString(6));
                pelicula.setRuntimeStr(rs.getString(7));
                pelicula.setPegi(rs.getString(8));
                return pelicula;
        }
    
}
