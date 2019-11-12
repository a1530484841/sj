package com.aaa.sujiexiche.sj.service.serviceimpl;

import com.aaa.sujiexiche.sj.entity.RoleUser;
import com.aaa.sujiexiche.sj.entity.YgmgsEntity;
import com.aaa.sujiexiche.sj.entity.sys_role;
import com.aaa.sujiexiche.sj.entity.sys_user;
import com.aaa.sujiexiche.sj.mapper.roleMapper;
import com.aaa.sujiexiche.sj.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {


    @Resource
    roleMapper rolemapper;
    //员工禁用，启用
    @Override
    public int updateUser(int u_id, String locked) {
        return rolemapper.updateUser(u_id,locked);
    }

    //驳回洗车工
    @Override
    public int Ygmabo(Integer yg_id) {
        return rolemapper.Ygmabo(yg_id);
    }

    //审核洗车工
    @Override
    public int Ygmsshen(Integer yg_id) {
        return rolemapper.Ygmsshen(yg_id);
    }

    @Override
    public List<RoleUser> selectRole(RoleUser sys) {
        return rolemapper.selectRole(sys);
    }
   //添加员工
    @Override
    public int insertUser(sys_user user) {
        return rolemapper.insertUser(user);
    }
    //查询洗车工
    @Override
    public List<YgmgsEntity> selectYgms(YgmgsEntity ygms) {
        return rolemapper.selectYgms(ygms);
    }

    //查询角色表
    @Override
    public List<sys_role> rolejiaose(sys_role role) {
        return rolemapper.rolejiaose(role);
    }

    //根据name查询出员工id
    @Override
    public sys_user selectuid(String username) {
        return rolemapper.selectuid(username);
    }
    //查询员工是否存在
    @Override
    public int seelectuser(String username) {
        return rolemapper.seelectuser(username);
    }
   //设置员工岗位
    @Override
    public int insertRoleUser(Integer u_id,Integer r_id) {
        return rolemapper.insertRoleUser(u_id,r_id);
    }

    @Override
    public List<sys_role> ChaRole(sys_role sr) {
        return rolemapper.ChaRole(sr);
    }
}
