package com.myprojects.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
class UserController {
	
	private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
	
	/*@RequestMapping(value = "/{register}", method = RequestMethod.POST)
	public boolean registerUser(@RequestBody User newUser) {
		return true;
	}*/
    
	@PostMapping("/{register}")
    public ResponseEntity<String> registerUser(@RequestBody User newUser, @PathVariable String register) {
        // Assuming registration was successful
        User savedUser = userRepository.save(newUser);
        return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully with ID: " + savedUser.getId());
    }
	
	
	
	@RequestMapping(value = "/{login}", method = RequestMethod.POST)
	public boolean loginUser(@RequestBody User loginUser) {
		return true;
	}
}
