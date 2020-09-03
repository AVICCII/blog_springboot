package com.aviccii.cc.dao;

import com.aviccii.cc.pojo.AdminRoleMenu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author aviccii 2020/9/3
 * @Discrimination
 */
public interface AdminRoleMenuDAO extends JpaRepository<AdminRoleMenu,Integer> {
        List<AdminRoleMenu> findAllByRid(int rid);
        List<AdminRoleMenu> findAllByRidIn(List<Integer> rids);
        void deleteAllByRid(int rid);
        }
