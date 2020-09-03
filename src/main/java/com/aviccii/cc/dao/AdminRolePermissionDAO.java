package com.aviccii.cc.dao;

import com.aviccii.cc.pojo.AdminRolePermission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author aviccii 2020/9/3
 * @Discrimination
 */
public interface AdminRolePermissionDAO extends JpaRepository<AdminRolePermission, Integer> {
        List<AdminRolePermission> findAllByRid(int rid);
        List<AdminRolePermission> findAllByRidIn(List<Integer> rids);
        void deleteAllByRid(int rid);
        }