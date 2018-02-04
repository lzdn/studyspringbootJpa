package com.springboot.studyjpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springboot.studyjpa.domain.Post;



public interface PostRepository extends CrudRepository<Post, Long> {	
	List<Post> findByTitle(String title);
	
}
