package com.uax.accesodatos.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uax.accesodatos.Interface.ReservaInterface;
import com.uax.accesodatos.dto.ListaReservaDto;
import com.uax.accesodatos.dto.ReservaDto;
import com.uax.accesodatos.mapper.ListaReservaRowMapper;
import com.uax.accesodatos.mapper.ReservaRowMapper;

@Repository
public class ReservaRepository implements ReservaInterface{

	@Autowired
	JdbcTemplate jdbcTemplate;

	// Obtener una lista de todas las Reservas por username.
	@Override
	public List<ListaReservaDto> getReserva(String username) {
		
		String sql = String.format("SELECT peliculas.titulo, reservas.fecha_ini, reservas.fecha_fin, reservas.precio, reservas.estado, reservas.pagado FROM peliculas, reservas "
				+ "WHERE peliculas.id=reservas.id and username='%s'",username); // Get all reservas
		List<ListaReservaDto> listaReservas = jdbcTemplate.query(sql, new ListaReservaRowMapper());
		
		return listaReservas; // Devuelve la lista de las ReservasDto
	}

	// Eliminar reserva por usernmae e id.
	@Override
	public boolean deleteReserva(String username, String id) {
		try {
			
		String sql = String.format("DELETE FROM reservas WHERE username='%s' and id='%s'",username,id); // Query delete reserva
		jdbcTemplate.execute(sql); // Ejecucion de la query
		
		}catch(Exception e) {
			e.getMessage();
			return false;
		}
		
		return true;
	}

	// Add reserva por Username e Id
	@Override
	public boolean addReserva(ReservaDto reserva) {
		
		try {
			
			String sql = String.format("INSERT INTO reservas VALUES('%s','%s','%s','%s',%d,'%s','%s')",
					reserva.getUsuario(),reserva.getId(),reserva.getFech_ini(),reserva.getFech_fin()
					,2,reserva.getEstado(),reserva.getPagado()); // Query inserccion
			jdbcTemplate.execute(sql); // Ejecucion de la query
			
		}catch (Exception e) {
			e.getMessage();
			return false;
		}
		
		return true;
	}
	
}
