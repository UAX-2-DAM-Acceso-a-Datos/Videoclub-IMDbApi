package com.uax.accesodatos.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.uax.accesodatos.Interface.ReservaInterface;
import com.uax.accesodatos.dto.ReservaDto;
import com.uax.accesodatos.mapper.ReservaRowMapper;

@Repository
public class ReservaRepository implements ReservaInterface{

	@Autowired
	JdbcTemplate jdbcTemplate;

	// Obtener una lista de todas las Reservas por username.
	@Override
	public List<ReservaDto> getReserva(String username) {
		
		String sql = String.format("SELECT username, id, fecha_ini, fecha_fin, precio, estado, pagado"
				+ " FROM reservas WHERE username='%s'",username); // Get all reservas
		List<ReservaDto> listaReservas = jdbcTemplate.query(sql, new ReservaRowMapper());
		
		return listaReservas; // Devuelve
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
			
			String sql = String.format("INSERT INTO reservas VALUES('%s','%s','%s','%s','%d','%s','%s')",
					reserva.getUsuario(),reserva.getId(),reserva.getFech_ini(),reserva.getFech_fin()
					,reserva.getPrecio(),reserva.getEstado(),reserva.getPagado()); // Query inserccion
			jdbcTemplate.execute(sql); // Ejecucion de la query
			
		}catch (Exception e) {
			e.getMessage();
			return false;
		}
		
		return true;
	}
	
}
