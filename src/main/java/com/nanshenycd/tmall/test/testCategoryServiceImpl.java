package com.nanshenycd.tmall.test;

import com.nanshenycd.tmall.pojo.Category;
import com.nanshenycd.tmall.service.CategoryService;
import com.nanshenycd.tmall.service.CategoryServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.ReflectionUtils;
import sun.reflect.misc.ReflectUtil;

import java.lang.reflect.Method;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class testCategoryServiceImpl {
@Autowired
    CategoryService categoryService;
@Test
public void test() {
    List<Category> list = categoryService.list();
    for (Category c:list){
        System.out.println(c.getName());
    }
}
}
