package com.myCollections.collection.repository;

import com.myCollections.collection.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByUsernameAndPassword(String username, String password);
    User findUserById(Long id);
    User findUserByEmail(String email);
    User findUserByUsername(String username);
    void deleteUserById(Long id);
}
