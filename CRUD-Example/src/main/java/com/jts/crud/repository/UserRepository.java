package com.jts.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jts.crud.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
