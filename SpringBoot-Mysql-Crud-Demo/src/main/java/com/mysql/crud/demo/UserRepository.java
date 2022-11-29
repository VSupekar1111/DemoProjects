package com.mysql.crud.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mysql.crud.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
