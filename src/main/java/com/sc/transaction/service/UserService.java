package com.sc.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.transaction.entity.Address;
import com.sc.transaction.entity.AddressRepository;
import com.sc.transaction.entity.User;
import com.sc.transaction.entity.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private AddressRepository addressRepository;

	@Transactional
	public User addUser(User user) {
		User dbUser = userRepository.save(user);

		Address addres = user.getAddress();

		addressRepository.save(addres);
		return dbUser;
	}
}
