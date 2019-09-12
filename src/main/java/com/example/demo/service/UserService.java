package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.dto.UserDto;


public interface UserService {
    UserDto getUserById(Integer userId);
    List<UserDto> getUsersByDate(String Date);
    void saveUser(UserDto userDto);
    List<UserDto> getAllUsers();
	void updateUser(UserDto userDto);
	void deleteUser(Integer userId);
}
