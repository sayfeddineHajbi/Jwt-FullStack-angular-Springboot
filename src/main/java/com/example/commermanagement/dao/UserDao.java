package com.example.commermanagement.dao;

import com.example.commermanagement.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,String> {
}
