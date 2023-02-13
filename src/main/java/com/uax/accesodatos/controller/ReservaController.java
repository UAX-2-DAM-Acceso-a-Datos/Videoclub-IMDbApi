package com.uax.accesodatos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReservaController {

	
	// Obtener vista Reserva
	@GetMapping("/reserva")
	public String getReserva() {
		
		return "reserva";
	}
	
}
