package com.springmvc.dao;

import com.springmvc.entities.User;

import java.util.List;

public interface UserDao {
    public void insertUser(User u);

    public List<User> getAllUsers();

    public User getUser(Long id);
}
