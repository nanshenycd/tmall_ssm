package com.nanshenycd.tmall.test;

import com.nanshenycd.tmall.pojo.Category;
import com.nanshenycd.tmall.service.CategoryService;
import com.nanshenycd.tmall.service.CategoryServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testBean {
@Autowired CategoryService categoryService;
    @Test
    public void test1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        CategoryServiceImpl bean = (CategoryServiceImpl) ctx.getBean("CategoryService");
        System.out.println(bean.list());
    }
}
