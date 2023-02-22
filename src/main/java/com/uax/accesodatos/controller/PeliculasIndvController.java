package com.uax.accesodatos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class PeliculasIndvController {

	
	@GetMapping("/PeliculaIndv")
	public String PeliculaIndv() {
		
		
		return "/PeliculaIndv.html";
		
	}
}
