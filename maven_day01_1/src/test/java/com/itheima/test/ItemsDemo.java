package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class  ItemsDemo {
    /*Dao测试*/
    @Test
    public void findById() {
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsDao itemsDao = app.getBean(ItemsDao.class);
        Items items = itemsDao.findById(1);
        System.out.println(items.getName());

    }

    /*srevice测试*/
    @Test
    public void  findById1(){
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsService itemsService = app.getBean(ItemsService.class);
        Items items = itemsService.findById(1);
        System.out.println(items.getName());

    }
}
