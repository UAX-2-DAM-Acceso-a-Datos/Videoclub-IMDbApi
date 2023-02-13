package com.uax.accesodatos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FavoritoController {
	@GetMapping("/go-to-favoritos")
	public String gotofavoritos(Model model) {
		return "favoritos";
		
	}
}
