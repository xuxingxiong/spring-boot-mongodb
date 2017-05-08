package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User findByUsername(String username) {

		return userRepository.findByUsername(username);
	}

	@Override
	public User save(User user) {

		return userRepository.save(user);
	}

	@Override
	public void delete(Long id) {

		userRepository.delete(id);
	}

	@Override
	public void delete(User user) {

		userRepository.delete(user);
	}

	@Override
	public User findOne(Long id) {

		return userRepository.findOne(id);
	}

	@Override
	public List<User> findAll() {

		return userRepository.findAll();
	}

	@Override
	public void deleteAll() {

		userRepository.deleteAll();
	}

}
