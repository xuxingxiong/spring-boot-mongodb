package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.UserInfo;
import com.example.repository.UserInfoRepository;
import com.example.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoRepository userInfoRepository;

	@Transactional(readOnly = true)
	@Override
	public UserInfo findByUsername(String username) {

		return userInfoRepository.findByUsername(username);
	}

}
