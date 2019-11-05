package com.aaa.sujiexiche.sj.config;


import com.aaa.sujiexiche.sj.entity.sys_permission;
import com.aaa.sujiexiche.sj.entity.sys_role;
import com.aaa.sujiexiche.sj.entity.sys_user;
import com.aaa.sujiexiche.sj.service.serviceimpl.userservice;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;

import javax.annotation.Resource;
import java.util.List;

public class UserRealm extends AuthorizingRealm {
    @Resource
    userservice us;
    //执行授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
        // TODO Auto-generated method stub
        System.out.println("授权");
        //给资源授权
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        //获取当前登录用户
        Subject subject = SecurityUtils.getSubject();
        sys_user user = (sys_user) subject.getPrincipal();
        if (user.getUsername().equals("wang")){
          //超级管理员，添加所有角色，添加所有权限
            simpleAuthorizationInfo.addRole("*");
            simpleAuthorizationInfo.addStringPermission("*");
        }else{
            //普通用户，查询用户的角色，根据角色查询权限
            int u_id=user.getU_id();
            List<sys_role> roles=this.us.getRoleByUser(u_id);
            if(null !=roles && roles.size()>0){
                           for (sys_role role:roles){
                               simpleAuthorizationInfo.addRole(role.getR_name());
                               //角色对应的权限数据
                               List<sys_permission> perms=this.us.findPermsByRoleId(role.getR_id());
                               System.out.println(perms);
                               if(null != perms && perms.size()>0){
                                   for (sys_permission perm:perms){
                           //路径
                           simpleAuthorizationInfo.addStringPermission(perm.getPercode());
                       }
                    }
                }
            }
        }
        return simpleAuthorizationInfo;
    }
    //执行认证逻辑
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
            throws AuthenticationException {
        // TODO Auto-generated method stub
        //UsernamePasswordToken用于存放提交的登录信息
        System.out.println("开始认证");
        //认证当前登录用户
        String username=(String) authenticationToken.getPrincipal();
        sys_user sys_user=null;
        System.out.println("username");
        try{
            //拿到当前用户信息
            sys_user=us.login(username);
            System.out.println(sys_user);
        }catch (Exception e){
            e.printStackTrace();
        }
        //如果用户名为空返回null
        if (sys_user==null){
            return null;
        }
        //与数据库进行比对 正确了返回info
        SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(sys_user,sys_user.getPassword(),"");
        return info;
    }

    /**
     * 清除所有缓存【实测无效】
     */
    public void clearCachedAuth(){

        this.clearCachedAuthorizationInfo(SecurityUtils.getSubject().getPrincipals());
    }
}
