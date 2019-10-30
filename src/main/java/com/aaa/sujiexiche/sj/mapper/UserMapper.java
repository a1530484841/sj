package com.aaa.sujiexiche.sj.mapper;

import com.aaa.sujiexiche.sj.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    //用户登录
    public UserEntity selectUser(String u_name);
    //用户注册
    public  int addUser(UserEntity userEntity);
}
