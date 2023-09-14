package com.aadhar.repository;

import org.springframework.data.repository.CrudRepository;

import com.aadhar.entity.User;

public interface UserRepo extends CrudRepository<User, Integer> {

}