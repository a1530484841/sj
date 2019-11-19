package com.aaa.sujiexiche.sj.mapper;

import com.aaa.sujiexiche.sj.entity.RoleUser;
import com.aaa.sujiexiche.sj.entity.sys_permission;
import com.aaa.sujiexiche.sj.entity.sys_role;
import com.aaa.sujiexiche.sj.entity.sys_user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface usermapper {
    //根据登录信息查询用户信息
    sys_user login(String username);
    //根据用户查询角色id
    List<sys_role> getRoleByUser(int u_id);
    //查询角色对应的权限数据
    List<sys_permission> findPermsByRoleId(int r_id);
    List<sys_permission> selectmenus(int u_id);
    List<sys_permission> selecturl(int u_id);
    //查询员工信息
    RoleUser selectRoleUser(String username);
    //修改员工信息
    int UpdateUser(@Param("password") String password,@Param("address") String address,
                   @Param("phone") String phone,@Param("u_id") int u_id);
}
