package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:
 * @创建时间: 2020/9/1 7:48
 * @描述：
 */
@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;
    @Override
    public List<Items> list() {
        return itemsDao.list();
    }

    /**
     * 增加  测试事务
     *
     * @param items
     * @return
     */
    @Override
    public int save(Items items) {
        int save = itemsDao.save(items);

        return  save;
    }
}
