package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;
import com.example.demo.utils.Constants;


@RequestMapping("/user")
@RestController
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping(Constants.GET_USER_BY_ID)
	public UserDto getUserById(@PathVariable Integer userId) {
		return userService.getUserById(userId);
	}
	
	@RequestMapping(Constants.GET_ALL_USERS)
	public List<UserDto> getAllUsers() {
		return userService.getAllUsers();
	}
	@RequestMapping(Constants.GET_USER_BY_Date)
	public List<UserDto> getUsersByDate(@PathVariable String Date) {
		System.out.printf("%nThisisitttttt");
		return userService.getUsersByDate(Date);
	}
	
	
	@RequestMapping(value= Constants.SAVE_USER, method= RequestMethod.POST)
	public void saveUser(@RequestBody UserDto userDto) {
		System.out.print("this is saveUser");
		userService.saveUser(userDto);
	}
	@RequestMapping(value= Constants.UPDATE_USER, method= RequestMethod.POST)
	public void updateUser(@RequestBody UserDto userDto) {
//		System.out.printf("%nthis is updateUser"+userDto.getCompany());
//		UserDto updateUser= userService.getUserById(userDto.getUserId());
//		updateUser.setCompany(userDto.getCompany());
//		updateUser.setDate(userDto.getDate());
//		updateUser.setSite(userDto.getSite());
//		updateUser.setResponse(userDto.getResponse());
//		updateUser.setLocation(userDto.getLocation());
//		updateUser.setPosition(userDto.getPosition());
		userService.deleteUser(userDto.getUserId());
		userService.saveUser(userDto);

	}
}
