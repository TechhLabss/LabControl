package com.controlab.ctl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.controlab.ctl.model.Usuario;
import com.controlab.ctl.repository.UsuarioRepositorio;

@RestController 
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	
	@GetMapping
	public List<Usuario> listar() {
		return usuarioRepositorio.findAll();
		
	}
	
	@PostMapping
	public Usuario colocar(@RequestBody Usuario usuario) {
		return usuarioRepositorio.save(usuario);
	}
	
}

