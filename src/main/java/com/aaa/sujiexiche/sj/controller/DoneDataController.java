package com.aaa.sujiexiche.sj.controller;

import com.aaa.sujiexiche.sj.entity.UserOrder;
import com.aaa.sujiexiche.sj.entity.xcg_order;
import com.aaa.sujiexiche.sj.service.DoneDataService;
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
public class DoneDataController {
    @Autowired
    private DoneDataService doneDataService;
    @RequestMapping("/toDone")
    public String toDone(){
        return "Zhu";
    }
    @RequestMapping("/getDoneToday")
    @ResponseBody
    public int getDoneToday(){
        return doneDataService.getDoneToday();
    }
    @RequestMapping("/getProceed")
    @ResponseBody
    public int getProceed(){
        return doneDataService.getProceed();
    }
    @RequestMapping("/gettuidan")
    @ResponseBody
    public int gettuidan(){
        return doneDataService.gettuidan();
    }
    @RequestMapping("/getdaixidan")
    @ResponseBody
    public int getdaixidan(){
        return doneDataService.getdaixidan();
    }


    @RequestMapping("/getTotalAndPrice")
    @ResponseBody
    public Object getTotalAndPrice(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<xcg_order> userOrders = doneDataService.getTotalAndPrice();
        PageInfo pageInfo = new PageInfo(userOrders);
        Map<String, Object> tableData = new HashMap<>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());

        return tableData;

    }

    @RequestMapping("/getAllTotalAndPrice")
    @ResponseBody
    public Object getAllTotalAndPrice(xcg_order xcgOrder,Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<xcg_order> userOrders=doneDataService.getAllTotalAndPrice(xcgOrder);
      //  PageInfo pageInfo=new PageInfo(userOrders);
        Map<String, Object> tableData =new HashMap<>();
        //这是layui要求返回的json数据格式
        tableData.put("code", 0);
        tableData.put("msg", "");
        //将全部数据的条数作为count传给前台（一共多少条）
       // tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", userOrders);

        return tableData;
    }
    }
