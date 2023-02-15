package com.uax.accesodatos.Interface;

import java.util.List;

import com.uax.accesodatos.dto.ReservaDto;

public interface ReservaInterface {
	
	public List<ReservaDto> getReserva(String username);// Obtener las reservas
	public boolean deleteReserva(String username, String id);// Eliminar la reserva.

}
