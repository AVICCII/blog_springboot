package com.aviccii.cc.service;

import com.aviccii.cc.dao.CategoryDAO;
import com.aviccii.cc.pojo.Category;
import org.springframework.data.domain.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author aviccii 2020/9/1
 * @Discrimination
 */
@Service
public class CategoryService {
    @Autowired
    CategoryDAO categoryDAO;

    public List<Category> list(){
        Sort sort = Sort.by(Sort.Direction.DESC,"id");
        return categoryDAO.findAll(sort);
    }
    public Category get(int id) {
        Category c= categoryDAO.findById(id).orElse(null);
        return c;
    }
}
