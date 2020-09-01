package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.aspectj.weaver.ast.Var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author:
 * @创建时间: 2020/9/1 7:44
 * @描述：
 */
//@RestController = @ResponseBody+@Controller
@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/list")
    public String list(Model model){
        List<Items> items = itemsService.list();
        //存入request中
        model.addAttribute("items",items);
        return "items";


    }
    @RequestMapping("/save")
    public String save(Items items){
        int save = itemsService.save(items);
        return "redirect:/items/list";

    }


}
