package com.uax.accesodatos.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	@GetMapping("/login")
	public String gotologin(Model model) throws Exception {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		model.addAttribute("userName",authentication.getName());
		

		return "login";
	}
	@GetMapping("/")
	public String gotoIndex(Model model) throws Exception {
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		model.addAttribute("userName",authentication.getName());
		

		return "index";
	}

}
