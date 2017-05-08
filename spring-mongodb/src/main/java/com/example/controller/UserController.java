package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/users")
@ResponseBody
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Integer findOne(@PathVariable("id") Long id) {
		return userService.findOne(id).getAge();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
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
