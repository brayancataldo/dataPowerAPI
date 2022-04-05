package com.dataPower.dataPowerAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dataPower.dataPowerAPI.entities.Tag;
@Repository
public interface TagRepository extends JpaRepository<Tag, Integer>{
	
}
