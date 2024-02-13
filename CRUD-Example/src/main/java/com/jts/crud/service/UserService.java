package com.jts.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jts.crud.entity.User;
import com.jts.crud.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public User findById(int id) {
		Optional<User> user = userRepository.findById(id);

		if (user.isEmpty()) {
			throw new RuntimeException("User not found");
		}

		return user.get();
	}

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User updateUser(User user) {
		Optional<User> dbuser = userRepository.findById(user.getId());

		if (dbuser.isEmpty()) {
			throw new RuntimeException("User not found");
		}

		User existingUser = dbuser.get();
		existingUser.setUsername(user.getUsername());

		return userRepository.save(existingUser);
	}

	public void deleteUser(int id) {
		Optional<User> dbuser = userRepository.findById(id);

		if (dbuser.isEmpty()) {
			throw new RuntimeException("User not found");
		}

		userRepository.delete(dbuser.get());
	}

}
