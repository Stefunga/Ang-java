package com.example.demo.converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Collectors;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;


public class UserConverter {
	public static User dtoToEntity(UserDto userDto) {
		System.out.printf("%nthis is dtoToEntity"+userDto.Company);
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate localDate = LocalDate.parse(userDto.getDate(), formatter);
		User user = new User(userDto.getPosition(),userDto.getLocation(),userDto.getCompany(),localDate,userDto.getResponse(),userDto.getSite());
		return user;
	}

	public static UserDto entityToDto(User user) {
		System.out.printf("%nthis is entityToDto"+user.getCompany());
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		UserDto userDto = new UserDto(user.getUserId(), user.getCompany(),user.getResponse(),user.getPosition(),user.getLocation(),user.getDate().format(dateTimeFormatter),user.getSite());
		return userDto;
	}
}
