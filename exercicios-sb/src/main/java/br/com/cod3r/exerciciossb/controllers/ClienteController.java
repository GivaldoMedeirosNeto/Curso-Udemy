package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.model.entities.Cliente;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@GetMapping("/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro", "123.456.789-00");
	}
	
	@GetMapping("/{id}")
	public Cliente obterClienteID(@PathVariable int id) {
		if(id == 1) {
			return new Cliente(id, "Givaldo Medeiros", "055.101.834-89");
		} else {
			return new Cliente(2, "Jorge Abel", "025.458.452-74");
		}
		
	}
	
	@GetMapping
	public Cliente obterClienteId(
			@RequestParam(name = "id", defaultValue = "1") int id) {
		return new Cliente(id, "Gabriella Xavier", "000.000.000-00");
	}
	
	/*@GetMapping("/{nome}")
	public Cliente obterCliente1(@PathVariable String nome) {
		return new Cliente(2, "Gabriella Xavier", "000.000.000-00");
	}*/

}
