package com.uax.accesodatos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uax.accesodatos.dto.ReservaDto;
import com.uax.accesodatos.repository.ReservaRepository;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ReservaController {

	@Autowired
	ReservaRepository reservaRepository;
	
	// Obtener vista Reserva
	@GetMapping("/reserva")
	public String getReserva(Model model, HttpServletRequest http) {
		
		String username = http.getUserPrincipal().getName();// Obtener el usuario
		
		List<ReservaDto> listaReservas = reservaRepository.getReserva(username); // Obtener todas las reservas de un usuario
		
		
		return "reservas";
	}
	
	@PostMapping("/eliminarReserva")
	public String deleteReserva(@RequestParam("username") String username, @RequestParam("id") String id) {
		
		reservaRepository.deleteReserva(username, id);
		
		return "reservas";
	}
	
	
	
}
