package com.jts.tdd;

import org.springframework.data.repository.ListCrudRepository;

interface PostRepository extends ListCrudRepository<Post, Integer> {

}