package com.example.demo.service.impl;

import com.example.demo.converter.UserConverter;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class UserServiceimpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public UserDto getUserById(Integer userId) {
		return UserConverter.entityToDto(userRepository.getOne(userId));
	}

	@Override
	public void saveUser(UserDto userDto) {
		System.out.printf("%nthis is inside save user");

		userRepository.save(UserConverter.dtoToEntity(userDto));
	}
	@RequestMapping(value="/User",method=RequestMethod.DELETE)
	public void deleteUser(@RequestParam Integer userId) {
	    userRepository.deleteEmploye(userId);
	    }
	@Override
	public void updateUser(UserDto userDto) {
		System.out.printf("%nthis is inside update user");
		userRepository.save(UserConverter.dtoToEntity(userDto));
	}

	public List<UserDto> getUsersByDate(String Date) {
		// TODO Auto-generated method stub
		System.out.printf("%nThis IS IT");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		LocalDate localDate = LocalDate.parse(Date, formatter);
		return userRepository.getDateEmploye(localDate).stream().map(UserConverter::entityToDto).collect(Collectors.toList());

	}
	@Override
	public List<UserDto> getAllUsers()  {
		return userRepository.findAll().stream().map(UserConverter::entityToDto).collect(Collectors.toList());
	
	}

}
