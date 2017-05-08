package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/{id}")
	@ResponseBody
	public Integer findOne(@PathVariable("id") Long id) {
		return userService.findOne(id).getAge();
	}

	@DeleteMapping(value = "/{id}")
	@ResponseBody
	public Long delete(@PathVariable("id") Long id) {
		Long id1 = 0L;
		User user = userService.findOne(id);
		if (user != null) {
			userService.delete(id);
			id1 = user.getId();
		}
		return id1;
	}
}
