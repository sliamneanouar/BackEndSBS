package com.mkyong.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mkyong.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
