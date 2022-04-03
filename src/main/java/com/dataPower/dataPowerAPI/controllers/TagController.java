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

import com.dataPower.dataPowerAPI.entities.Tag;
import com.dataPower.dataPowerAPI.services.TagService;

@RestController
@CrossOrigin(value = "*")
@RequestMapping("/tag")
public class TagController {

	@Autowired
	private TagService tagService;
	
	@GetMapping("/tags-por-usuario-id/{usuarioId}")
	public String findAllTagsByUsuarioId(@PathVariable Integer usuarioId){
		return "Chegou" + usuarioId;
	}
	
	@GetMapping
	public ResponseEntity<List<Tag>> findAll() {
		return new ResponseEntity<>(tagService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Tag> findById(@PathVariable Integer id) {
		Tag user = tagService.findById(id);
		if(user != null) {
			return new ResponseEntity<>(user, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@PostMapping("/save")
	public ResponseEntity <Tag> save(@RequestBody Tag tag) {
		return new ResponseEntity<>(tagService.save(tag), HttpStatus.OK);
	}
}
