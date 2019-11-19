package com.aaa.sujiexiche.sj.controller;

import com.aaa.sujiexiche.sj.entity.UserOrder;
import com.aaa.sujiexiche.sj.entity.yh_burse;
import com.aaa.sujiexiche.sj.entity.YgmgsEntity;
import com.aaa.sujiexiche.sj.entity.Yhorder;
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
public class UserOrderController{
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

    @RequestMapping("selectTui")
        @ResponseBody
        public Object selectTui(UserOrder userOrder,Integer page, Integer limit){

            PageHelper.startPage(page, limit);

            List<UserOrder> userOrders=userOrderService.selectTui(userOrder);

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
    public Object toSelect(YgmgsEntity ygmgsEntity,String yg_area){

        ygmgsEntity.setYg_area(yg_area);
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

        if(update==1){
            return "修改成功";
        }else{
            return "添加失败";
        }

    }

    @RequestMapping("updateYgstyle")
    @ResponseBody
    public Object updateYgstyle(YgmgsEntity ygmgsEntity){

        int update = userOrderService.UpdateYgstyle(ygmgsEntity);

        if(update==1){
            return "修改成功";
        }else{
            return "添加失败";
        }

    }




    //查询正在进行中的订单

    @RequestMapping("selectOrdering")
    @ResponseBody
    public Object selectOrdering(xcg_order xcgorder,Integer page, Integer limit){

        PageHelper.startPage(page, limit);

        List<xcg_order> xcgOrder=userOrderService.selectOrdering(xcgorder);
        PageInfo pageInfo=new PageInfo(xcgOrder);
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


    @RequestMapping("updateYhordertwo")
    @ResponseBody
    public Object updateYhordertwo(UserOrder userOrder){
        int update = userOrderService.UpdateYhordertwo(userOrder);

        if(update==1){
            return "修改成功";
        }else{
            return "添加失败";
        }

    }

    @RequestMapping("updateYgstyletwo")
    @ResponseBody
    public Object updateYgstyletwo(YgmgsEntity ygmgsEntity){

        int update = userOrderService.UpdateYgstyletwo(ygmgsEntity);

        if(update==1){
            return "修改成功";
        }else{
            return "添加失败";
        }

    }

    @RequestMapping("Delexcg_order")
    @ResponseBody
    public Object Delexcg_order(int xcg_id){

        int update = userOrderService.Delexcg_order(xcg_id);

        if(update==1){
            return "取消成功";
        }else{
            return "取消失败";
        }

    }
//退款
    @RequestMapping("selectXcgorder")
    @ResponseBody
    public Object selectXcgorder(xcg_order xcg_order, Yhorder yhorder,yh_burse yhburse){
        System.out.println(xcg_order);
        System.out.println(yhorder);
        System.out.println(yhburse);
        int update = userOrderService.selectXcgorder(xcg_order);
        System.out.println(update);
        if(update==1){
            userOrderService.updatexcgOrder(xcg_order);
            userOrderService.updateYhorder(yhorder);
            userOrderService.updateYh_burse(yhburse);
            return "退款成功";
        }else if(update==0){
            userOrderService.updateYhorder(yhorder);
            return "退款成功";
        }else {
            return "退款失败";
        }
      }

      //驳回
      @RequestMapping("selectXcgordertwo")
      @ResponseBody
    public Object selectXcgordertwo(xcg_order xcg_order, Yhorder yhorder){
          int update = userOrderService.selectXcgorder(xcg_order);
          System.out.println(update);
          if(update==1){
              userOrderService.updatexcgOrderend(xcg_order);
              userOrderService.updateYhorderend(yhorder);
              userOrderService.updateYhorderbz(yhorder);
              return "已驳回！";
          }else if(update==0){
              userOrderService.updateYhorderend(yhorder);
              userOrderService.updateYhorderbz(yhorder);
              return "已驳回！";
          }else {
              return "驳回失败";
          }
    }



}
