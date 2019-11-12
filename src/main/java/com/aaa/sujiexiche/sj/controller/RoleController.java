package com.aaa.sujiexiche.sj.controller;

import com.aaa.sujiexiche.sj.entity.RoleUser;
import com.aaa.sujiexiche.sj.entity.YgmgsEntity;
import com.aaa.sujiexiche.sj.entity.sys_role;
import com.aaa.sujiexiche.sj.entity.sys_user;
import com.aaa.sujiexiche.sj.service.RoleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("role")
public class RoleController {
    @Resource
    RoleService roleservice;
    @RequestMapping("SelectUser")
    @ResponseBody
    public Object SelectUser(RoleUser sys,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<RoleUser> users=roleservice.selectRole(sys);
        System.out.println(roleservice.selectRole(sys));
        PageInfo pageInfo=new PageInfo(users);
        Map<String,Object> tableData=new HashMap<>();
        System.out.println(tableData);
        //这是layui要求返回的json数据格式
        tableData.put("code",0);
        tableData.put("msg","");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }

    //查询员工岗位
    @RequestMapping("toRole")
    @ResponseBody
    public Object toSelect(sys_role sr){
        System.out.println(sr);
        List<sys_role> aa=roleservice.ChaRole(sr);
        System.out.println(aa);
        return aa;
    }
    //添加员工
    @RequestMapping("addUser")
    @ResponseBody
    public Object inert(sys_user user,Integer r_id){
        int i=roleservice.seelectuser(user.getUsername());

        if(i==0){
            int j=roleservice.insertUser(user);
            sys_user users=roleservice.selectuid(user.getUsername());
            System.out.println(users.getU_id()+r_id);
            roleservice.insertRoleUser(users.getU_id(),r_id);
            return j;
        }else{
            return "添加失败";
        }
    }
    //查询角色
    @RequestMapping("SelectRole")
    @ResponseBody
    public Object SelectRole(sys_role role,Integer page,Integer limit){
        PageHelper.startPage(page,limit);
        List<sys_role> roles=roleservice.rolejiaose(role);
        PageInfo pageInfo=new PageInfo(roles);
        Map<String,Object> tableData=new HashMap<>();
        System.out.println(tableData);
        //这是layui要求返回的json数据格式
        tableData.put("code",0);
        tableData.put("msg","");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
    //查询角色
    @RequestMapping("SelectYgmgs")
    @ResponseBody
    public Object SelectYgmgs(YgmgsEntity ymgs, Integer page, Integer limit){
        PageHelper.startPage(page,limit);
        List<YgmgsEntity> ygmgs=roleservice.selectYgms(ymgs);
        PageInfo pageInfo=new PageInfo(ygmgs);
        Map<String,Object> tableData=new HashMap<>();
        System.out.println(tableData);
        //这是layui要求返回的json数据格式
        tableData.put("code",0);
        tableData.put("msg","");
        //将全部数据的条数作为count传给前台（一共多少条）
        tableData.put("count", pageInfo.getTotal());
        //将分页后的数据返回（每页要显示的数据）
        tableData.put("data", pageInfo.getList());
        return tableData;
    }
    //审核洗车工
    @RequestMapping("YgmaShen")
    @ResponseBody
    public int YgmaShen(Integer yg_id){
        int y=roleservice.Ygmsshen(yg_id);
            return y;
    }
    //驳回洗车工
    @RequestMapping("Ygmabo")
    @ResponseBody
    public int Ygmabo(Integer yg_id){
        int y=roleservice.Ygmsshen(yg_id);
        return y;
    }
    //员工禁用与解禁
    @RequestMapping("updateUser")
    @ResponseBody
    public int updateUser(Integer u_id,String locked){
        System.out.println(locked);
        if(locked.equals("0")){
            int y=roleservice.updateUser(u_id,locked);
            return 1;
        }else if(locked.equals("1")){
            int y=roleservice.updateUser(u_id,locked);
            return 2;
        }else{
            return 0;
        }
    }
}
