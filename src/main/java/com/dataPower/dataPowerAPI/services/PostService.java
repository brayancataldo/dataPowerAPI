package com.dataPower.dataPowerAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataPower.dataPowerAPI.entities.Post;
import com.dataPower.dataPowerAPI.repositories.PostRepository;

@Service
public class PostService {

	@Autowired
	public PostRepository postRepository;
	
	public Post findById(Integer id) {
		return postRepository.findById(id).get();
	}
	
   public List<Post> findAll(){
        return postRepository.findAll();
    }
   
    public Post save(Post post){
        return postRepository.save(post);
    }
    
    public Post update(Post post, Integer id){
    	Post postAtualizado = findById(id);
        if(post.getDescricao() != null) {
        	postAtualizado.setDescricao(post.getDescricao());
        }
        if(post.getDataPost() != null) {
        	postAtualizado.setDataPost(post.getDataPost());
        }
        
        if(post.getUsuarioId() != null) {
        	postAtualizado.setUsuarioId(post.getUsuarioId());
        }
       
        return postRepository.save(post);
    }

    public void deleteById(Integer id){
    	postRepository.deleteById(id);
    }
   
}
