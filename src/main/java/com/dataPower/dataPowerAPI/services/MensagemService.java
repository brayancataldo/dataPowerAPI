package com.dataPower.dataPowerAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataPower.dataPowerAPI.entities.Mensagem;
import com.dataPower.dataPowerAPI.repositories.MensagemRepository;

@Service
public class MensagemService {

	@Autowired
	public MensagemRepository mensagemRepository;
	
	public Mensagem findById(Integer id) {
		return mensagemRepository.findById(id).get();
	}
	
   public List<Mensagem> getChatMessages(Integer usuarioOrigem, Integer usuarioDestino){
        return mensagemRepository.getChatMessages(usuarioOrigem ,usuarioDestino);
    }
	
   public List<Mensagem> findAll(){
        return mensagemRepository.findAll();
    }
   
    public Mensagem save(Mensagem mensagem){
        return mensagemRepository.save(mensagem);
    }
    
    public Mensagem update(Mensagem mensagem, Integer id){
    	Mensagem mensagemAtualizada = findById(id);
        if(mensagem.getDescricao() != null) {
        	mensagemAtualizada.setDescricao(mensagem.getDescricao());
        }
        if(mensagem.getDataMensagem() != null) {
        	mensagemAtualizada.setDataMensagem(mensagem.getDataMensagem());
        }
        
        if(mensagem.getUsuarioOrigem() != null) {
        	mensagemAtualizada.setUsuarioOrigem(mensagem.getUsuarioOrigem());
        }
        
        if(mensagem.getUsuarioDestino() != null) {
        	mensagemAtualizada.setUsuarioDestino(mensagem.getUsuarioDestino());
        }
       
        return mensagemRepository.save(mensagemAtualizada);
    }

    public void deleteById(Integer id){
    	mensagemRepository.deleteById(id);
    }
   
}
