package com.springmvc.service;

import com.springmvc.dao.UserDao;
import com.springmvc.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserDao userDao;

    public void createUser(User user) {
        System.out.println("In user Service" + user);
        userDao.insertUser(user);
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public User getUser(Long id) {
        return userDao.getUser(id);
    }
}
