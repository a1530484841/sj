package com.aaa.sujiexiche.sj.service.serviceimpl;


import com.aaa.sujiexiche.sj.entity.RoleUser;
import com.aaa.sujiexiche.sj.entity.sys_permission;
import com.aaa.sujiexiche.sj.entity.sys_role;
import com.aaa.sujiexiche.sj.entity.sys_user;
import com.aaa.sujiexiche.sj.mapper.usermapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class userservice {
    @Resource
    usermapper um;
    public sys_user login(String username){
        return um.login(username);
    }
    //根据用户查询角色id
    public List<sys_role> getRoleByUser(int u_id){
        return um.getRoleByUser(u_id);
    }
    //查询角色对应的权限数据
    public List<sys_permission> findPermsByRoleId(int r_id){
        return um.findPermsByRoleId(r_id);
    }
    public List<sys_permission> selectmenus(int u_id){
        return um.selectmenus(u_id);
    }
    public List<sys_permission> selecturl(int u_id){
        return um.selecturl(u_id);
    }
    //查询员工个人信息
    public RoleUser selectRoleUser(String username){
        return um.selectRoleUser(username);
    }
    //修改员工信息
    public int UpdateUser(String password,String address,String phone,int u_id){
        return um.UpdateUser(password,address,phone,u_id);
    }
}
