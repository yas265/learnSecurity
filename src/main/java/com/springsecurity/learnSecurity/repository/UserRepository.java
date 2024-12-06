package com.springsecurity.learnSecurity.repository;


import com.springsecurity.learnSecurity.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
