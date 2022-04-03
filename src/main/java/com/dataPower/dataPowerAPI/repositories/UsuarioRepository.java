package com.dataPower.dataPowerAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dataPower.dataPowerAPI.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	Usuario findByNomeUsuario(String nomeUsuario);
}
