package study.service.impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.domain.entity.User;
import study.domain.repository.UserRepository;
import study.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Transactional
	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}

	@Transactional
	@Override
	public User getUser(Long id) {
		// Optional -> 조회하려는 값이 존재할 수도, 존재하지 않을 수도 있기 때문에 null에 의한 오류 최소화 하기 위해 사용
		Optional<User> user = userRepository.findById(id);
		
		return user.get();
	}
}
