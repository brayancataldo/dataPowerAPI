package com.dataPower.dataPowerAPI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataPower.dataPowerAPI.entities.Usuario;
import com.dataPower.dataPowerAPI.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	public UsuarioRepository usuarioRepository;
	
	public Usuario findById(Integer id) {
		return usuarioRepository.findById(id).get();
	}
	
	public Usuario findByNomeUsuario(String nomeUsuario) {
		return usuarioRepository.findByNomeUsuario(nomeUsuario);
	}
	
   public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }

    public Usuario save(Usuario usuario){
    	Usuario novoUsuario = usuarioRepository.save(usuario);
        return novoUsuario;
    }
    
    public Usuario update(Usuario usuario, Integer id){
        Usuario usuarioAtualizado = findById(id);
        if(usuario.getNome() != null) {
        	usuarioAtualizado.setNome(usuario.getNome());
        }
        if(usuario.getEmail() != null) {
        	usuarioAtualizado.setEmail(usuario.getEmail());
        }
        if(usuario.getSenha() != null) {
        	usuarioAtualizado.setSenha(usuario.getSenha());
        }
        if(usuario.getFoto() != null) {
        	usuarioAtualizado.setFoto(usuario.getFoto());
        }
        if(usuario.getDataNascimento() != null) {
        	usuarioAtualizado.setDataNascimento(usuario.getDataNascimento());
        }
        if(usuario.getNomeUsuario() != null) {
        	usuarioAtualizado.setNomeUsuario(usuario.getNomeUsuario());
        }
        if(usuario.getBio() != null) {
        	usuarioAtualizado.setBio(usuario.getBio());
        }
        if(usuario.getCidade() != null) {
        	usuarioAtualizado.setCidade(usuario.getCidade());
        }
        
        if(usuario.getLatitude() != null) {
        	usuarioAtualizado.setLatitude(usuario.getLatitude());
        }
        
        if(usuario.getLongitude() != null) {
        	usuarioAtualizado.setLongitude(usuario.getLongitude());
        }
      
        return usuarioRepository.save(usuarioAtualizado);
    }
    
    public Boolean updateLatLong(String latitude, String longitude, Integer id){
        Usuario usuarioAtualizado = findById(id);
        if(latitude != null) {
        	usuarioAtualizado.setLatitude(latitude);
        }
        
        if(longitude != null) {
        	usuarioAtualizado.setLongitude(longitude);
        }
        usuarioRepository.save(usuarioAtualizado);
        return true;
    }

    /*
    public void deleteById(Integer id){
        Usuario usuario = findById(id);
        usuario.setAtivo(false);
    }*/
    

    public Usuario findNomeUsuario(String nomeUsuario) {
		return usuarioRepository.findByNomeUsuario(nomeUsuario);
    }
    
}



















