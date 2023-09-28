package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
	//@RequestMapping(method = RequestMethod.GET, path = "/ola")
	@GetMapping({"/ola", "/saudacao"})
	public String ola() {
		return "Olá Spring Boot!";
	}
	
	@GetMapping({"/givaldomedeiros"})
	public String GivaldoMedeiros() {
		return "Seja Bem Vindo - Givaldo Medeiros Neto";
	}

}
