package com.dataPower.dataPowerAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dataPower.dataPowerAPI.entities.Mensagem;
import com.dataPower.dataPowerAPI.services.MensagemService;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/mensagens")
public class MensagemController {

	@Autowired
	private MensagemService mensagemService;
	
	@GetMapping
	public ResponseEntity<List<Mensagem>> findAll() {
		return new ResponseEntity<>(mensagemService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/chat")
	public ResponseEntity<List<Mensagem>> getChatMessages(@RequestParam Integer usuarioOrigem, @RequestParam Integer usuarioDestino){
		return new ResponseEntity<>(mensagemService.getChatMessages(usuarioOrigem, usuarioDestino), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Mensagem> findById(@PathVariable Integer id) {
		Mensagem mensagem = mensagemService.findById(id);
		if(mensagem != null) {
			return new ResponseEntity<>(mensagem, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
		
	@PostMapping("/save")
	public ResponseEntity <Mensagem> save(@RequestBody Mensagem mensagem) {
		return new ResponseEntity<>(mensagemService.save(mensagem), HttpStatus.OK);
	}
}
