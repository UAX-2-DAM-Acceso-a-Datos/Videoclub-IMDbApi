package com.uax.accesodatos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReservaController {

	@GetMapping("/reserva")
	public String getReserva() {
		
		return "reserva";
	}
	
}
