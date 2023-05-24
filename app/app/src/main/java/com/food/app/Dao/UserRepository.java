package com.food.app.Dao;

import com.food.app.Enties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findOneByUsernameAndPassword(String username, String password);

    User findByUsername(String username);
}

