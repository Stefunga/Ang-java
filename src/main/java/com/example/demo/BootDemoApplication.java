package com.example.demo;

import com.example.demo.entity.Skill;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@SpringBootApplication
public class BootDemoApplication {
	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(BootDemoApplication.class, args);
	}

	@PostConstruct
	public void setupDbWithData(){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

		String date = "16/08/2016";
		
		//convert String to LocalDate
		LocalDate localDate = LocalDate.parse(date, formatter);
		User user2 = new User("Dev", "NYC", "FB", localDate, "Reject","Linkedin");
		User user3 = new User("Developer", "NYC", "FB", localDate, "Reject","Indeed");
		user2= userRepository.save(user2);
		user3= userRepository.save(user3);
		
	}
}
