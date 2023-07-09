package com.example.commermanagement.dao;

import com.example.commermanagement.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface RoleDao extends CrudRepository<Role,String> {
}
