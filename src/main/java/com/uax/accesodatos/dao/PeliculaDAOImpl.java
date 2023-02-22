package com.uax.accesodatos.dao;

import java.util.ArrayList;

import com.uax.accesodatos.IDAO.PeliculaDAOInterface;
import com.uax.accesodatos.dto.PeliculasDto;
import com.uax.accesodatos.repository.PeliculasRepository;

public class PeliculaDAOImpl implements PeliculaDAOInterface {

	
	PeliculasRepository a= new PeliculasRepository();
	
	
	public ArrayList<PeliculasDto> GetAllPeliculas() {
		
		ArrayList<PeliculasDto> b =new ArrayList();
		b.addAll(a.getAllPeliculas());
		
		String query="SELECT peliculas.nombre FROM usuarios,peliculas,reservas WHERE usuarios.username=reservas.username AND reservas.id=peliculas.id AND";
		return b;
	}

}
