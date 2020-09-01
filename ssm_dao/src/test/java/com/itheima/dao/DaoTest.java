package com.itheima.dao;

import com.itheima.pojo.Items;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

/**
 * @author:
 * @创建时间: 2020/8/31 20:17
 * @描述：
 */
public class DaoTest {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");

        ItemsDao itemsDao = (ItemsDao) context.getBean("itemsDao");

        Items items = new Items();
        items.setName("商品名称");
        items.setPrice(16666f);
        items.setCreatetime(new Date());
        items.setDetail("as");

        itemsDao.save(items);

        List<Items> list = itemsDao.list();
        for (Items items1 : list) {
            System.out.println(items1);
        }
    }

}
