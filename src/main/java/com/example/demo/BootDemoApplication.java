package com.example.demo;

import com.example.demo.entity.Skill;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
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
		User user2 = new User("Dev", "NYC", "FB", "8/11/19", "Reject","Linkedin");
		User user3 = new User("Developer", "NYC", "FB", "8/12/19", "Reject","Indeed");
		user2= userRepository.save(user2);
		user3= userRepository.save(user3);
		
	}
}
