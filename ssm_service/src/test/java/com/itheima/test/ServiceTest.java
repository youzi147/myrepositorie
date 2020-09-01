package com.itheima.test;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

/**
 * @author:
 * @创建时间: 2020/9/1 8:03
 * @描述：
 */
public class ServiceTest {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-service.xml");

        ItemsService itemsService = (ItemsService) context.getBean("itemsServiceImpl");

        Items items = new Items();
        items.setName("kb");
        items.setCreatetime(new Date());
        items.setPrice(1888f);

        items.setDetail("p");
        itemsService.save(items);

        List<Items> list = itemsService.list();
        for (Items im : list) {
            System.out.println(im);
        }


    }

}
