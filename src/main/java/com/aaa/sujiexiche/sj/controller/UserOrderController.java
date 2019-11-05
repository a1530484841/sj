package com.aaa.sujiexiche.sj.controller;

import com.aaa.sujiexiche.sj.entity.UserOrder;
import com.aaa.sujiexiche.sj.entity.YgmgsEntity;
import com.aaa.sujiexiche.sj.entity.xcg_order;
import com.aaa.sujiexiche.sj.service.UserOrderService;
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
public class UserOrderController {
      @Autowired
    private UserOrderService userOrderService;
      @RequestMapping("selectUserOrder")
      @ResponseBody
    public Object selectUserOrder(UserOrder userOrder,Integer page, Integer limit){

          PageHelper.startPage(page, limit);

          List<UserOrder> userOrders=userOrderService.selectUserOrder(userOrder);
          PageInfo pageInfo=new PageInfo(userOrders);
          Map<String, Object> tableData =new HashMap<>();
          //这是layui要求返回的json数据格式
          tableData.put("code", 0);
          tableData.put("msg", "");
          //将全部数据的条数作为count传给前台（一共多少条）
          tableData.put("count", pageInfo.getTotal());
          //将分页后的数据返回（每页要显示的数据）
          tableData.put("data", pageInfo.getList());

           return tableData;
      }
    //页面跳转
    @RequestMapping("UserOrder")
    public Object order(){
        return "Waiting";
    }


  //查询闲置的洗车工
    @RequestMapping("toSelect")
    @ResponseBody
    public Object toSelect(YgmgsEntity ygmgsEntity){
        System.out.println(ygmgsEntity);
        List<YgmgsEntity> aa=userOrderService.selectYgmgs(ygmgsEntity);
        return aa;
    }

    //派单：把当前信息加入到洗车工的订单表
    @RequestMapping("addxcgorder")
    @ResponseBody
    public Object insert(xcg_order xcgorder){
        int add = userOrderService.addXcg_order(xcgorder);
        if(add==1){
            return "派单成功";
        }else{
            return "派单失败";
        }

    }

    @RequestMapping("updateYhorder")
    @ResponseBody
    public Object updateYhorder(UserOrder userOrder){
        int update = userOrderService.UpdateYhorder(userOrder);
        System.out.println(userOrder);
        System.out.println(update);
        if(update==1){
            return "修改成功";
        }else{
            return "添加失败";
        }

    }
}
