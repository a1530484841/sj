package com.aaa.sujiexiche.sj.service.serviceimpl;

import com.aaa.sujiexiche.sj.entity.UserEntity;
import com.aaa.sujiexiche.sj.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    UserMapper userMapper;
    public UserEntity selectUser(String u_name){
        return userMapper.selectUser(u_name);
    }

    public  int addUser(UserEntity userEntity){
        return  userMapper.addUser(userEntity);
    }


}
