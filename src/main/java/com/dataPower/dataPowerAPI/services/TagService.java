package com.dataPower.dataPowerAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataPower.dataPowerAPI.entities.Tag;
import com.dataPower.dataPowerAPI.repositories.TagRepository;
import com.dataPower.dataPowerAPI.repositories.TagUsuarioRepository;

@Service
public class TagService {

	@Autowired
	public TagRepository tagRepository;
	
	@Autowired
	public TagUsuarioRepository tagUsuarioRepository;
	
	public Tag findById(Integer id) {
		return tagRepository.findById(id).get();
	}
	
   public List<Tag> findAll(){
        return tagRepository.findAll();
    }
   
    public Tag save(Tag Tag){
        return tagRepository.save(Tag);
    }
    
    public Tag update(Tag tag, Integer id){
        Tag tagAtualizado = findById(id);
        if(tag.getNome() != null) {
        	tagAtualizado.setNome(tag.getNome());
        }
        if(tag.getDescricao() != null) {
        	tagAtualizado.setDescricao(tag.getDescricao());
        }
       
        return tagRepository.save(tag);
    }

    public void deleteById(Integer id){
    	tagRepository.deleteById(id);
    }
   
}
