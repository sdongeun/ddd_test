package study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import study.domain.entity.User;
import study.service.UserService;

@RestController
@RequestMapping("/index")
public class UserController {
		
	UserService service;
	
	@PostMapping("/join")
	public String join(@RequestBody User user) {
	
		service.addUser(user);
		
		return user.getName()+"님의 회원가입을 축하드립니다.";
	}
	
	@GetMapping("/user")
	public User findUser(@RequestParam Long id) {
		
		return service.getUser(id);
	}
}
