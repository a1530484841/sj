package com.aaa.sujiexiche.sj.service;

import com.aaa.sujiexiche.sj.entity.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService {
    //查询员工信息
    List<RoleUser> selectRole(RoleUser sys);
    //查询职位表
    List<sys_role> ChaRole(sys_role sr);
    //查询员工是否存在
    int seelectuser(String username);
    //添加员工
    int insertUser(sys_user user);
    //根据员工name查找员工id
    sys_user selectuid(String username);
    //给员工设置岗位
    int insertRoleUser(Integer u_id,Integer r_id);
    //查询角色表
    List<sys_role> rolejiaose(sys_role role);
    //查询洗车工
    List<YgmgsEntity> selectYgms(YgmgsEntity ygms);
    //审核洗车工
    int Ygmsshen(Integer yg_id);
    //驳回洗车工
    int Ygmabo(Integer yg_id);
    //员工禁用，启用
    int updateUser(int u_id,String locked);
    //查询权限menu
    List<sys_permission> selectpermission(sys_permission permission);
    //查询权限permission
    List<sys_permission> selectzi(sys_permission permission);
    //查询岗位现有权限
    List<sys_role_permission> selectGang(Integer r_id);
    //删除岗位现有权限
    int delpermission(Integer r_id);
    //添加员工权限
    int addpermission(Integer p_id,Integer r_id);
}
