package com.aaa.sujiexiche.sj.config;

import com.aaa.sujiexiche.sj.entity.UserEntity;
import com.aaa.sujiexiche.sj.service.serviceimpl.UserService;

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
import java.util.HashSet;
import java.util.Set;

//继承AuthorizingRealm类
public class UserRealm extends AuthorizingRealm {
    @Resource
    UserService userService;

    @Override
    //实现AuthorizingRealm类中的授权方法
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("开始授权");
        //建立HashSet集合
        Set<String> permissions=new HashSet<>();
        //构建shiro的授权信息
        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();

        //获取当前用户的所有的权限
        Subject subject= SecurityUtils.getSubject();

     //获取认证过后的用户信息
        UserEntity user=(UserEntity) subject.getPrincipal();
        try{
            //把用户的权限路径添加到集合里面
            permissions.add(user.getUrl());
        }catch (Exception e){
            e.printStackTrace();
        }

        info.setStringPermissions(permissions);
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("开始认证");
        //认证当前登录用户
        String username=(String) authenticationToken.getPrincipal();
        UserEntity userEntity=null;
        System.out.println("username");


        try{
            //拿到当前用户信息
            userEntity=userService.selectUser(username);
            System.out.println(userEntity);
        }catch (Exception e){
            e.printStackTrace();
        }
        //如果用户名为空返回null
           if (userEntity==null){
               return null;
           }
           //与数据库进行比对 正确了返回info
        SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(userEntity,userEntity.getPassword(),"");


        return info;
    }
}
