package com.aaa.sujiexiche.sj.mapper;

import com.aaa.sujiexiche.sj.entity.RoleUser;
import com.aaa.sujiexiche.sj.entity.YgmgsEntity;
import com.aaa.sujiexiche.sj.entity.sys_role;
import com.aaa.sujiexiche.sj.entity.sys_user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface roleMapper {
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
    int insertRoleUser(@Param("u_id") Integer u_id,@Param("r_id")Integer r_id);
    //查询角色表
    List<sys_role> rolejiaose(sys_role role);
    //查询洗车工
    List<YgmgsEntity> selectYgms(YgmgsEntity ygms);
    //审核洗车工
    int Ygmsshen(Integer yg_id);
    //驳回洗车工
    int Ygmabo(Integer yg_id);
    //员工禁用，启用
    int updateUser(@Param("u_id") int u_id,@Param("locked")String locked);
}
