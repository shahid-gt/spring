package com.springmvc.dao;

import com.springmvc.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private HibernateTemplate hTemplate;

    public void sethTemplate(HibernateTemplate hTemplate) {
        this.hTemplate = hTemplate;
    }


    @Transactional
    public void insertUser(User user) {
        System.out.println("In UserDao" + user);
        hTemplate.save(user);
    }

    public List<User> getAllUsers() {
        List<User> users = hTemplate.loadAll(User.class);
        System.out.println("DAO[getAllUsers]: List of users have been fetched: " + users);
        return users;
    }

    public User getUser(Long id) {
        User user = hTemplate.get(User.class, id);
        System.out.println("DAO[getUser]: getting user: " + user);
        return user;
    }
}
