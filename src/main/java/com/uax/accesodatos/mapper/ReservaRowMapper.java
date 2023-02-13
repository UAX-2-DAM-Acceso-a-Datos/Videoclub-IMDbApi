package com.uax.accesodatos.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.uax.accesodatos.dto.ReservaDto;

public class ReservaRowMapper implements RowMapper<ReservaDto>{

	@Override
	public ReservaDto mapRow(ResultSet rs, int rowNum) throws SQLException {

		ReservaDto reserva = new ReservaDto();
		
		reserva.setUsuario(rs.getString(0));
		reserva.setId(rs.getString(1));
		reserva.setFech_ini(rs.getString(2));
		reserva.setFech_fin(rs.getString(3));
		reserva.setPrecio(rs.getString(4));
		reserva.setEstado(rs.getString(5));
		reserva.setPagado(rs.getString(6));
		
		return reserva;
	}

}
