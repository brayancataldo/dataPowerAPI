package com.dataPower.dataPowerAPI.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dataPower.dataPowerAPI.entities.Mensagem;
@Repository
public interface MensagemRepository extends JpaRepository<Mensagem, Integer>{
	
	 @Query(value="select * from mensagem where usuario_origem= :usuarioOrigem and usuario_destino= :usuarioDestino or usuario_origem= :usuarioDestino and usuario_destino= :usuarioOrigem", nativeQuery=true)
	    List<Mensagem> getChatMessages(Integer usuarioOrigem, Integer usuarioDestino);
}
