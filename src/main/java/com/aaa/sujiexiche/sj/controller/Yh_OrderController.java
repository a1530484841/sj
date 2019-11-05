package com.aaa.sujiexiche.sj.controller;

import com.aaa.sujiexiche.sj.entity.Yhorder;

import com.aaa.sujiexiche.sj.service.Yh_OrdersService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("page")
public class Yh_OrderController {
    @Autowired
    private Yh_OrdersService yh_ordersService;

    @RequestMapping("select")
    @ResponseBody
    public Object YhorderSelect(Yhorder yhorder, Integer page, Integer limit){
   
        PageHelper.startPage(page, limit);

        List<Yhorder> yhorders=yh_ordersService.SelectYhorder(yhorder);
        PageInfo pageInfo=new PageInfo(yhorders);
        Map<String, Object> tableData = new HashMap<String, Object>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());

        return tableData;

    }

    @RequestMapping("order")
    public Object order(){
        return "Order";
    }

}


