package com.aaa.sujiexiche.sj.controller;

import com.aaa.sujiexiche.sj.entity.UserEntity;
import com.aaa.sujiexiche.sj.service.serviceimpl.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class LoginController {
    @Resource
    UserService userService;

    @RequestMapping("toLogin")
    public String toLogin(){
        return "Login";
    }

    @RequestMapping("findGl")
    public String findGl(){
        return  "users/add";
    }

    @RequestMapping("findYh")
    public String findYh(){
        return  "users/gl";
    }

    @RequestMapping("success")
    public String success(){
        return  "a";
    }
    @RequestMapping("selectUser")

    public String selectUser(String username, String password, Model model){
        //掉用查询方法
        UserEntity user=userService.selectUser(username);
        System.out.println(username+"+"+password);
        //获取登录用户信息
        Subject subject= SecurityUtils.getSubject();
        //拿到凭证
        UsernamePasswordToken token=new UsernamePasswordToken(username,password);


        try {
            //进行登录
            subject.login(token);
            return "a";
        } catch (UnknownAccountException e) {
            model.addAttribute("msg","不存在此用户");
            return "Login";
        }catch (IncorrectCredentialsException e){
            model.addAttribute("msg","密码错误");
            return  "Login";
        }


    }

}
