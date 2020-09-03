package com.aviccii.cc.dao;
import com.aviccii.cc.pojo.AdminPermission;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author aviccii 2020/9/3
 * @Discrimination
 */
public interface AdminPermissionDAO extends JpaRepository<AdminPermission, Integer> {
    AdminPermission findById(int id);
}