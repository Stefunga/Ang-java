package com.example.demo.converter;

import java.util.stream.Collectors;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;


public class UserConverter {
	public static User dtoToEntity(UserDto userDto) {
		System.out.printf("%nIn this area2"+userDto.Company);
		User user = new User(userDto.getPosition(),userDto.getLocation(),userDto.getCompany(),userDto.getDate(),userDto.getResponse(),userDto.getSite());
		return user;
	}

	public static UserDto entityToDto(User user) {
		System.out.print("Hi guys1"+user.getCompany());

		UserDto userDto = new UserDto(user.getUserId(), user.getCompany(),user.getResponse(),user.getPosition(),user.getLocation(), user.getDate(),user.getSite());
		return userDto;
	}
}
