package study.service;

import study.domain.entity.User;

public interface UserService {
	/**
	 * 사용자 등록
	 * @param user 사용자 정보
	 */
	public void addUser(User user);
	
	/**
	 * 사용자 조회
	 * @param id 사용자 아이디
	 * @return user 사용자 정보
	 */
	public User getUser(Long id);
}
