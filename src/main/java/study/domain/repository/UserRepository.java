package study.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.domain.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
