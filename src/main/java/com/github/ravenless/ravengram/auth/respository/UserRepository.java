package com.github.ravenless.ravengram.auth.respository;

import com.github.ravenless.ravengram.auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * User repository
 *
 * @author Voronenkov Aleksei
 * @since 10.01.2020
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    Boolean existsByEmail(String email);
}
