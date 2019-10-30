package com.aaa.sujiexiche.sj.controller;

import com.aaa.sujiexiche.sj.entity.Yhorder;

import com.aaa.sujiexiche.sj.service.Yh_OrdersService;
import com.aaa.sujiexiche.sj.util.FenyeResult;
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
     public Map<String,Object> select(Integer page, Integer limit){
         Map<String,Object> map =new HashMap<>();
         map.put("page",(page-1)*limit);
         map.put("limit",limit);
         List<Yhorder> yhordersList = yh_ordersService.SelectYhorder(map);
         //查詢總條數
         Integer count = yh_ordersService.selectEmpCount(map);
         System.out.println(yhordersList);
         System.out.println(count);

         return FenyeResult.fenye(yhordersList,count);
     }
     @RequestMapping("order")
        public  String page(){
         return "Order";
        }


}
