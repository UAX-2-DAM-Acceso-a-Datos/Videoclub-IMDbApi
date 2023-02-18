package com.uax.accesodatos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uax.accesodatos.Interface.ReservaServiceInterface;
import com.uax.accesodatos.dto.ListaReservaDto;
import com.uax.accesodatos.dto.ReservaDto;
import com.uax.accesodatos.repository.ReservaRepository;

@Service
public class ReservaService implements ReservaServiceInterface{

	@Autowired
	ReservaRepository reservaRepository;
	
	// Add reserva
	@Override
	public boolean addReservaService(ReservaDto reserva) {
		
		try {
			reservaRepository.addReserva(reserva);
		}catch(Exception e) {
			e.getMessage();
			return false;
		}
		
		return true;
	}

	// Delete reservas
	@Override
	public boolean deleteReservaService(String username, String id) {

		reservaRepository.deleteReserva(username, id);
		
		return false;
	}

	// Get all reservas
	@Override
	public List<ListaReservaDto> listaReservaService(String username) {

		return reservaRepository.getReserva(username);
	}

	
	
}
