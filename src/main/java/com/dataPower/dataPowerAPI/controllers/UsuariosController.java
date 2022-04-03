package com.dataPower.dataPowerAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dataPower.dataPowerAPI.entities.Usuario;
import com.dataPower.dataPowerAPI.services.UsuarioService;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/usuario")
public class UsuariosController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> findAll() {
		return new ResponseEntity<>(usuarioService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> findById(@PathVariable Integer id) {
		Usuario user = usuarioService.findById(id);
		if(user != null) {
			return new ResponseEntity<>(user, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/por-nome-usuario/{nomeUsuario}")
	public ResponseEntity<Usuario> findByNomeUsuario(@PathVariable String nomeUsuario) {
		Usuario user = usuarioService.findByNomeUsuario(nomeUsuario);
		if(user != null) {
			return new ResponseEntity<>(user, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@PostMapping("/save")
	public ResponseEntity <Usuario> save(@RequestBody Usuario usuario) {
		return new ResponseEntity<>(usuarioService.save(usuario), HttpStatus.OK);
	}
	
	@PutMapping("/update-lat-long/{id}")
	public ResponseEntity <String> updateLatLong(@RequestParam String latitude, @RequestParam String longitude, @PathVariable Integer id) {
		usuarioService.updateLatLong(latitude, longitude, id);
		return new ResponseEntity<>("Latitude e Longitude atualizada com sucesso!", HttpStatus.OK);
	}

	@GetMapping("/login")
	public ResponseEntity<Usuario> Login( @RequestParam String nomeUsuario, @RequestParam String senha) {
		Usuario user = usuarioService.findByNomeUsuario(nomeUsuario);
		if(user.getSenha().equals(senha)) {
			return new ResponseEntity<>(user, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@GetMapping("/verifica-nome-usuario/{nomeUsuario}")
	public ResponseEntity<Boolean> VerificaNomeUsuario(@PathVariable String nomeUsuario){
		if(usuarioService.findNomeUsuario(nomeUsuario) != null) {
			return new ResponseEntity<>(true, HttpStatus.OK);
		}
		return new ResponseEntity<>(false, HttpStatus.OK);
	}
	
}
