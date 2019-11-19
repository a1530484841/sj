package com.aaa.sujiexiche.sj.controller;

import com.aaa.sujiexiche.sj.entity.YgmgsEntity;
import com.aaa.sujiexiche.sj.entity.Yhorder;
import com.aaa.sujiexiche.sj.entity.xcg_order;
import com.aaa.sujiexiche.sj.entity.yh_users;

import com.aaa.sujiexiche.sj.service.Yh_OrdersService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
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
//查询已完成订单
    @RequestMapping("select")
    @ResponseBody
    public Object YhorderSelect(xcg_order xcgOrder, Integer page, Integer limit){

        PageHelper.startPage(page, limit);

        List<xcg_order> yhorders=yh_ordersService.SelectYhorder(xcgOrder);
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


    //查询用户详情
    @RequestMapping("selectUsers")
    @ResponseBody
    public Object selectUsers(yh_users yhusers,String yh_name){

        yhusers.setYh_name(yh_name);
       List<yh_users> yhuserss= yh_ordersService.SelectYhusers(yhusers);
        PageInfo pageInfo=new PageInfo(yhuserss);
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


    //查询洗车工详情
    @RequestMapping("SelectYgmgs")
    @ResponseBody
    public Object SelectYgmgs(YgmgsEntity ygmgsEntity){


        List<YgmgsEntity> ygmgsEntitys= yh_ordersService.SelectYgmgs(ygmgsEntity);
        PageInfo pageInfo=new PageInfo(ygmgsEntitys);
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

    //修改洗车工信息

    @RequestMapping("UpdateYgmgs")
    @ResponseBody
    public Object UpdateYgmgs(YgmgsEntity ygmgsEntity){

        int up = yh_ordersService.UpdateYgmgs(ygmgsEntity);

        if(up==1){
            return "修改成功";
        }else{
            return "修改失败";
        }

    }


    @RequestMapping("AddYgmgs")
    @ResponseBody
    public Object AddYgmgs(YgmgsEntity ygmgsEntity){

        int up = yh_ordersService.AddYgmgs(ygmgsEntity);
        if(up==1){
            return "添加成功";
        }else{
            return "添加失败";
        }

    }

    @RequestMapping("DeleYgmgs")
    @ResponseBody
    public Object DeleYgmgs(YgmgsEntity ygmgsEntity){
        int up = yh_ordersService.DeleYgmgs(ygmgsEntity);
        if(up==1){
            return "删除成功";
        }else{
            return "删除失败";
        }

    }



}


