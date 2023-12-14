package web.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.springboot.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {
}
