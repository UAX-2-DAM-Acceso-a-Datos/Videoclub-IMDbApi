package com.uax.accesodatos.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.uax.accesodatos.dto.RankingResponseDto;
import com.uax.accesodatos.services.Top250Service;

@Controller
public class Index2Controller {
	@Autowired
	private Top250Service serviciopelis;
	
	@GetMapping("/index2")
	public String gotoIndex2(Model model) throws Exception {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		model.addAttribute("userName", authentication.getName());
		ArrayList<RankingResponseDto> lista = serviciopelis.getmostPopular();
		model.addAttribute("peliculas2", lista);
		return "/views/index2";
	}
	
}
