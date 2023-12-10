package com.springmvc.dao;

import com.springmvc.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

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
}
