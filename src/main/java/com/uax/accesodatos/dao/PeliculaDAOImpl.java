package com.uax.accesodatos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mysql.cj.xdevapi.Statement;
import com.uax.accesodatos.IDAO.PeliculaDAOInterface;
import com.uax.accesodatos.dto.PeliculasDto;

public class PeliculaDAOImpl implements PeliculaDAOInterface {

	
	Statement statement=null;
	PreparedStatement PST=null;
	Connection connection = null;
	PeliculasDto persona=null;
	
	
	public boolean GetAllPeliculas() {
		
		
		
		
		
		
		
		return true;
	}
	
	public boolean getReservasByUser() {
		
	//Hacer la query	//String query="SELECT * FROM Peliculas";
		
		
		return true;
	}
}
