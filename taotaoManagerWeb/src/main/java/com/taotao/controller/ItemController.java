package com.taotao.controller;

import com.taotao.common.pojo.EasyUIDataGridResult;
import com.taotao.pojo.TbItem;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 孙建荣 on 17-5-30.下午10:23
 */
@Controller
public class ItemController {

    @Autowired
    private ItemService itemServiceImpl;

    @RequestMapping("/item-add")
    public String itemAdd() {
        return "item-add";
    }

    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable Long itemId) {
        return itemServiceImpl.getItemById(itemId);
    }

    @RequestMapping(value = "/item-list")
    @ResponseBody
    public EasyUIDataGridResult getItemList(Integer page, Integer rows) {
        EasyUIDataGridResult itemList = itemServiceImpl.getItemList(page, rows);
        return itemList;
    }


}










