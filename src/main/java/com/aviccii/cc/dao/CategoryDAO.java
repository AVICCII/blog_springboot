package com.aviccii.cc.dao;

import com.aviccii.cc.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author aviccii 2020/9/1
 * @Discrimination
 */
public interface CategoryDAO extends JpaRepository<Category,Integer> {

}
