package com.uax.accesodatos.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.uax.accesodatos.dto.PeliculasDto;

public class PeliculasRowMapper implements RowMapper<PeliculasDto>{
        
        @Override
        public PeliculasDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        	//Creación del objeto
                PeliculasDto pelicula = new PeliculasDto();
              //Asignacion del atributo al objeto
                pelicula.setId(rs.getString(1));
              //Asignacion del atributo al objeto
                pelicula.setTitulo(rs.getString(2));
              //Asignacion del atributo al objeto
                pelicula.setPlot(rs.getString(3));
              //Asignacion del atributo al objeto
                pelicula.setImagen(rs.getString(4));
              //Asignacion del atributo al objeto
                pelicula.setImDbRating(rs.getString(5));
              //Asignacion del atributo al objeto
                pelicula.setTrailer(rs.getString(6));
              //Asignacion del atributo al objeto
                pelicula.setRuntimeStr(rs.getString(7));
              //Asignacion del atributo al objeto
                pelicula.setPegi(rs.getString(8));
                
              //Retorno de pelicula
                return pelicula;
        }
    
}
