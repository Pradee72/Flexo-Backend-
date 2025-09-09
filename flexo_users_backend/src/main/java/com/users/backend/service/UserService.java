package com.users.backend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users.backend.dao.UserDao;
import com.users.backend.dto.UserDto;
import com.users.backend.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public UserDao addUser(UserDto userDto) {
		Optional<UserDao> existingUser = userRepository.findById(userDto.getId());

		if (existingUser.isPresent()) {
			// User already exists, return the existing user
			return existingUser.get();
		}

		// User does not exist, create and save new one
		UserDao userDao = new UserDao();
		userDao.setId(userDto.getId());
		userDao.setEmail(userDto.getEmail());

		return userRepository.save(userDao);
	}
}
