package com.example.service;

import java.util.List;

import com.example.entity.User;

public interface UserService {

	User save(User user);

	User findOne(Long id);

	List<User> findAll();

	User findByUsername(String username);

	void delete(Long id);

	void delete(User user);

	void deleteAll();
}
