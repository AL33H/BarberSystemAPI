package com.BarberShopAPI.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BarberShopAPI.model.Usuario;
import com.BarberShopAPI.repository.UserRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UserRepository ur;

	@GetMapping
	public ArrayList<Usuario> ListarTodos() {

		return (ArrayList<Usuario>) ur.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Optional<Usuario> ProcurarPorId(@PathVariable Long id) {
		
		return ur.findById(id);
	}
	
	
	@PostMapping
	public Usuario adicionar(@RequestBody Usuario usuario) {
		return ur.save(usuario);
	}

}
