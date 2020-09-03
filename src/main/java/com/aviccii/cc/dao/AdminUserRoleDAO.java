package com.aviccii.cc.dao;
import com.aviccii.cc.pojo.AdminUserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
/**
 * @author aviccii 2020/9/3
 * @Discrimination
 */
public interface AdminUserRoleDAO  extends JpaRepository<AdminUserRole,Integer> {
    List<AdminUserRole> findAllByUid(int uid);
    void deleteAllByUid(int uid);
}