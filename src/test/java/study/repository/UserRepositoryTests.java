package study.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import study.StudyApplicationTests;
import study.domain.entity.User;
import study.domain.repository.UserRepository;


public class UserRepositoryTests extends StudyApplicationTests{
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
	public void create() {
		User user = new User();
		
		user.setAccount("testId");
		user.setPassword("testPw");
		user.setName("dongeun");
		
		User newUser = userRepository.save(user);
	}
	
}
