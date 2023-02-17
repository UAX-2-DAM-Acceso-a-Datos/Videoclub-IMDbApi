package com.uax.accesodatos.Interface;

import java.util.List;

import com.uax.accesodatos.dto.ReservaDto;

public interface ReservaServiceInterface {

	public boolean addReservaService(ReservaDto reserva);
	public boolean deleteReservaService(String username, String id);
	public List<ReservaDto> listaReservaService(String username); 
	
}
