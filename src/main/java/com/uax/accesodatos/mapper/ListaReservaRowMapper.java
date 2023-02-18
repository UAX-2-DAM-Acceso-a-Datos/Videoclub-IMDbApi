package com.uax.accesodatos.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.uax.accesodatos.dto.ListaReservaDto;

public class ListaReservaRowMapper implements RowMapper<ListaReservaDto>{

	@Override
	public ListaReservaDto mapRow(ResultSet rs, int rowNum) throws SQLException {

		ListaReservaDto reserva = new ListaReservaDto();
		
		reserva.setTitulo(rs.getString(1));
		reserva.setFecha_ini(rs.getString(2));
		reserva.setFecha_fin(rs.getString(3));
		reserva.setPrecio(rs.getInt(4));
		reserva.setEstado(rs.getString(5));
		reserva.setPagado(rs.getString(6));
		
		return reserva;
	}



}
