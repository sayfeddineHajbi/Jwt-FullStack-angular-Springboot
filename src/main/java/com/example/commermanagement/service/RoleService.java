package com.example.commermanagement.service;

import com.example.commermanagement.dao.RoleDao;
import com.example.commermanagement.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private RoleDao roleDao;
    public Role createNewRole(Role role){
       return roleDao.save(role);
    }
}
