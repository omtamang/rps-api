package com.OmTamang.webService.rest_web_service_for_rochpaperscissors.users;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.OmTamang.webService.rest_web_service_for_rochpaperscissors.respository.UserRepository;

@RestController
public class UserController {
	
	private UserRepository userRepository;
	
	public UserController(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@GetMapping("/users")
	public List<Users> getUsers() {
		return userRepository.findAll();
	}
	
	@GetMapping("/users/{username}")
	public List<Users> getByuserName(@PathVariable String username){
		return userRepository.findByUserName(username);
	}
	
}
