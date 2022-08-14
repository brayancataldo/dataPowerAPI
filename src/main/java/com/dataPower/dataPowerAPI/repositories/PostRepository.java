package com.dataPower.dataPowerAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dataPower.dataPowerAPI.entities.Post;
@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{
	
}
