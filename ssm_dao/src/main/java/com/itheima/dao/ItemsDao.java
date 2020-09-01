package com.itheima.dao;

import com.itheima.pojo.Items;
import org.mybatis.spring.SqlSessionFactoryBean;

import java.util.List;

/**
 * @author:
 * @创建时间: 2020/8/31 19:58
 * @描述：
 */
public interface ItemsDao {

    /**
     * 查询所有
     */
    List<Items> list();

    /**
     * 保存操作
     *
     */
    int save(Items items);

}
