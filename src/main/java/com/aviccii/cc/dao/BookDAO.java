package com.aviccii.cc.dao;

import com.aviccii.cc.pojo.Book;
import com.aviccii.cc.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author aviccii 2020/9/1
 * @Discrimination
 */
public interface BookDAO extends JpaRepository<Book,Integer> {
    List<Book> findAllByCategory(Category category);
    List<Book> findAllByTitleLikeOrAuthorLike(String keyword1, String keyword2);
}