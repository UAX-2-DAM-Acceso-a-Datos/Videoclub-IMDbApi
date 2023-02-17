package com.uax.accesodatos.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.uax.accesodatos.dto.ReservaDto;

public class ReservaRowMapper implements RowMapper<ReservaDto>{

	@Override
	public ReservaDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		//Creación del objeto
		ReservaDto reserva = new ReservaDto();
		//Asignacion del atributo al objeto
		reserva.setUsuario(rs.getString(0));
		//Asignacion del atributo al objeto
		reserva.setId(rs.getString(1));
		//Asignacion del atributo al objeto
		reserva.setFech_ini(rs.getString(2));
		//Asignacion del atributo al objeto
		reserva.setFech_fin(rs.getString(3));
		//Asignacion del atributo al objeto
		reserva.setPrecio(rs.getDouble(4));
		//Asignacion del atributo al objeto
		reserva.setEstado(rs.getString(5));
		//Asignacion del atributo al objeto
		reserva.setPagado(rs.getString(6));
		
		return reserva;
	}

}
