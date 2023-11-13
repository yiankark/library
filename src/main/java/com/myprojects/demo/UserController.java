package com.myprojects.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
class UserController {
	
	@RequestMapping(value = "/{register}", method = RequestMethod.POST)
	public boolean registerUser(@RequestBody User newUser) {
		return true;
	}
	
	@RequestMapping(value = "/{login}", method = RequestMethod.POST)
	public boolean loginUser(@RequestBody User loginUser) {
		return true;
	}
}
