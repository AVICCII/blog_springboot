package com.aviccii.cc.dao;
import com.aviccii.cc.pojo.AdminRole;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author aviccii 2020/9/3
 * @Discrimination
 */
public interface AdminRoleDAO extends JpaRepository<AdminRole, Integer> {
    AdminRole findById(int id);
}