

package com.nanshenycd.tmall.service;

import com.nanshenycd.tmall.pojo.Category;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface CategoryService{
    List<Category> list();

    void add(Category category);

    void delete(int id);

    Category get(int id);

    void update(Category category);
}

