package dio.java.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dio.java.api.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
