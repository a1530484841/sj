package com.aaa.sujiexiche.sj.controller;

import com.aaa.sujiexiche.sj.entity.xcg_order;
import com.aaa.sujiexiche.sj.service.MonthMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MonthMoneyController {
    @Autowired
    private MonthMoneyService monthMoneyService;
    @RequestMapping("/gethtml")
    public String gethtml(){
        return "monthmoney";
    }
    @RequestMapping("/getmonth")
    @ResponseBody
    public List<xcg_order> getmonth(){
        return monthMoneyService.getmonth();
    }
}
