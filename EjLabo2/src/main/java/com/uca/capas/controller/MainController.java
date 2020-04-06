package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;

@Controller
public class MainController {

	@GetMapping("/agregarUsuario")
	public String sendForm(Usuario usuario) { 
		return "agregarUsuario"; 
	}
	
	@PostMapping("/agregarUsuario")
	public String processForm(Usuario usuario) {
		return "mostrarMensaje";
	}
	
}
