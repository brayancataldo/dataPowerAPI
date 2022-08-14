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
import org.springframework.web.bind.annotation.RestController;

import com.dataPower.dataPowerAPI.entities.Post;
import com.dataPower.dataPowerAPI.services.PostService;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/post")
public class PostController {

	@Autowired
	private PostService postService;

	@GetMapping("/teste/{mensagem}")
	public String findAllPostsByUsuarioId(@PathVariable String mensagem){
		return "Chegou" + mensagem;
	}

	
	/*
	@GetMapping("/posts-por-usuario-id/{usuarioId}")
	public String findAllPostsByUsuarioId(@PathVariable Integer usuarioId){
		return "Chegou" + usuarioId;
	}
*/
	
	@GetMapping
	public ResponseEntity<List<Post>> findAll() {
		return new ResponseEntity<>(postService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Post> findById(@PathVariable Integer id) {
		Post post = postService.findById(id);
		if(post != null) {
			return new ResponseEntity<>(post, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
		
	@PostMapping("/save")
	public ResponseEntity <Post> save(@RequestBody Post post) {
		return new ResponseEntity<>(postService.save(post), HttpStatus.OK);
	}
}
