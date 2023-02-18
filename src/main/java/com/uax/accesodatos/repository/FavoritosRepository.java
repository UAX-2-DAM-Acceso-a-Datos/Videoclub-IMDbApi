package com.uax.accesodatos.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uax.accesodatos.Interface.FavoritoInterface;
import com.uax.accesodatos.dto.FavoritosDto;
import com.uax.accesodatos.mapper.FavoritosMapper;

@Repository
public class FavoritosRepository implements FavoritoInterface {
	@Autowired
	private JdbcTemplate jdbctemplate;

	@Override
	public List<FavoritosDto> getFavoritos(String user) {
		try {
			//query obtener favoritos
			String sql = String.format("Select peliculas.id from favoritos,users peliculas WHERE favoritos.username=users.username AND favoritos.id=peliculas.id AND users.username='%s'", user);
			return jdbctemplate.query(sql, new FavoritosMapper());

		} catch (Exception e) {
			e.getMessage();
			return null;
		}
		

	}

	@Override
	public boolean addFavorito(FavoritosDto a) {
		try {
			//query insertar a favoritos 
			String sql = String.format("Insert into favoritos(username,id) values ('%s','%s')", a.getUsername(),
					a.getId());
			jdbctemplate.execute(sql);
			return true;

		} catch (Exception e) {
			e.getMessage();
		}
		return false;
	}

	@Override
	public boolean deleteFavorito(FavoritosDto a) {
		try {
			//borrar de la tabla de favoritos
			String sql = String.format("DELETE from favoritos where username = '%s' and id = '%s' ", a.getUsername(),
					a.getId());
			jdbctemplate.execute(sql);
			return true;

		} catch (Exception e) {
			e.getMessage();
			return false;
		}
		
	}

}
