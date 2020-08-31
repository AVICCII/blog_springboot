package com.aviccii.cc.service;

import com.aviccii.cc.dao.UserDAO;
import com.aviccii.cc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author aviccii 2020/8/31
 * @Discrimination
 */
@Service
public class UserService {
    @Autowired
    UserDAO userDAO;

    public boolean isExist(String username){
        User user = getByName(username);
        return null!=user;
    }

    public User getByName(String username){
        return userDAO.findByUsername(username);
    }

    public User get(String username,String password){
        return userDAO.getByUsernameAndPassword(username,password);
    }

    public void add(User user){
        userDAO.save(user);
    }
}
