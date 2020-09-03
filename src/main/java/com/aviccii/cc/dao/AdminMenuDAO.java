package com.aviccii.cc.dao;
import com.aviccii.cc.pojo.AdminMenu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
/**
 * @author aviccii 2020/9/3
 * @Discrimination
 */
public interface AdminMenuDAO extends JpaRepository<AdminMenu, Integer> {
    AdminMenu findById(int id);
    List<AdminMenu> findAllByParentId(int parentId);
}

