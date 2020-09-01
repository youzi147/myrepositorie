package com.itheima.service;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * @author:
 * @创建时间: 2020/9/1 7:47
 * @描述：
 */
public interface ItemsService {
    /**
     *
     * 列表查询
     *
     * @return
     */
    List<Items> list();

    /**
     * 增加
     * @param items
     * @return
     */
    int save(Items items);


}
