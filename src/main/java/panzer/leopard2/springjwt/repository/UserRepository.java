package panzer.leopard2.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import panzer.leopard2.springjwt.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    Boolean existsByUsername(String username);
}
