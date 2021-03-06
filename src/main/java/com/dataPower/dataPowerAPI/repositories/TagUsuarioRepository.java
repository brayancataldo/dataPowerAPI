package com.dataPower.dataPowerAPI.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dataPower.dataPowerAPI.entities.TagUsuario;
@Repository
public interface TagUsuarioRepository  extends JpaRepository<TagUsuario, Integer> {
	
	 @Query(value="select * from relacao_tag_usuario where id_usuario= :idUsuario", nativeQuery=true)
    List<TagUsuario> getAll(Integer idUsuario);
	
}