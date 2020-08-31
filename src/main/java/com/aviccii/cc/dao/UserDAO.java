package com.aviccii.cc.dao;

import com.aviccii.cc.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author aviccii 2020/8/31
 * @Discrimination
 */
public interface UserDAO extends JpaRepository<User,Integer> {
    User findByUsername(String username);

    User getByUsernameAndPassword(String username,String password);

}
