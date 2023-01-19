package com.entrega.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entrega.domain.model.Cliente;

@RestController
public class ClienteController {
	
	
	@GetMapping("/clientes")
	public List <Cliente>listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("joão");
		cliente1.setTelefone("71 9999-1111");
		cliente1.setEmail("Joaodasbotas@gmail.com");
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(1L);
		cliente2.setNome("Maria");
		cliente2.setTelefone("71 9999-2222");
		cliente2.setEmail("mariadasilva@gmail.com");
		
		
		return Arrays.asList(cliente1, cliente2);
	}
}
