package com.uax.accesodatos.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uax.accesodatos.services.TrailerService;

public class TrailerController {
	@GetMapping("/trailer")
	public String trailer(@RequestParam("id") String id, Model model) {
		TrailerService a=new TrailerService();
		
		return "redirect:"+a.gettrailerbyid(id)+"";
	}

}
