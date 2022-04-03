package com.dataPower.dataPowerAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dataPower.dataPowerAPI.entities.Tag;

public interface TagRepository extends JpaRepository<Tag, Integer>{
	
}
