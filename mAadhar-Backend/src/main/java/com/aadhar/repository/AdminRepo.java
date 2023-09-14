package com.aadhar.repository;

import org.springframework.data.repository.CrudRepository;

import com.aadhar.entity.Admin;

public interface AdminRepo extends CrudRepository<Admin, Integer> {

}
