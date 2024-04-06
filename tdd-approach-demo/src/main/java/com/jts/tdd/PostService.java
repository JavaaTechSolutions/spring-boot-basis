package com.jts.tdd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
	
	@Autowired
	PostRepository postRepository;

	public List<Post> findAllPost() {
		return postRepository.findAll();
	}

	public Post findById(int id) {
		return postRepository.findById(id).get();
	}

}
