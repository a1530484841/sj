package com.aaa.sujiexiche.sj.controller;


import com.aaa.sujiexiche.sj.entity.RoleUser;
import com.aaa.sujiexiche.sj.entity.sys_permission;
import com.aaa.sujiexiche.sj.entity.sys_user;
import com.aaa.sujiexiche.sj.service.serviceimpl.userservice;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class usercontroller {
    @Resource
    userservice us;
    @RequestMapping("toLogin")
    public String toLogin(){
        return "Login";
    }
    @RequestMapping("success")
    public String success(){
        return  "a";
    }

    @RequestMapping("permission")
    public String permission(){
        return  "error";
    }
    @RequestMapping("shou")
    public String shou(){
        return  "error";
    }
    @RequestMapping("selectUser")
    public String selectUser(String username, String password, Model model,HttpSession session){
        //掉用查询方法
        sys_user user=us.login(username);

        //获取登录用户信息
        Subject subject= SecurityUtils.getSubject();
        //拿到凭证
        UsernamePasswordToken token=new UsernamePasswordToken(username,password);
        try {
            int u_id=user.getU_id();

            List<sys_permission> menus=us.selecturl(u_id);
            List<sys_permission> permissions=us.selectmenus(u_id);
            model.addAttribute("menus",menus);
            model.addAttribute("permissions",permissions);
            //进行登录
            session.setAttribute("u_id",u_id);
            model.addAttribute("username",username);
            subject.login(token);
            return "a";
        }catch (Exception exception) {
            if (exception instanceof UnknownAccountException) {
                model.addAttribute("msg","登录失败，用户账号不存在！");
                return "Login";
            } else if (exception instanceof IncorrectCredentialsException) {
                model.addAttribute("msg","登录失败，用户账号不存在！");
                return "Login";
            } else{
                model.addAttribute("msg","登录失败，用户名或密码不正确！");
                return "Login";
            }
        }
    }
    @RequestMapping("selectRoleUser")
    @ResponseBody
    public Object selectRoleUser(String username,Model model){
        RoleUser ru=us.selectRoleUser(username);
        model.addAttribute("ru",ru);
        return ru;
    }
    @RequestMapping("UpdateUser")
    @ResponseBody
    public int UpdateUser(String password,String address,String phone,int u_id){
        int s=us.UpdateUser(password,address,phone,u_id);
        if(s>0){
            return s;
        }else {
            return 0;
        }
    }
}
