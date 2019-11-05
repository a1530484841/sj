package com.aaa.sujiexiche.sj.mapper;

import com.aaa.sujiexiche.sj.entity.UserOrder;
import com.aaa.sujiexiche.sj.entity.YgmgsEntity;
import com.aaa.sujiexiche.sj.entity.xcg_order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserOrderMapper {
    //查询用户提交的洗车订单
    List<UserOrder> selectUserOrder(UserOrder userOrder);

    //查询空闲以及负责区域和当前用户同步的员工
    List<YgmgsEntity> selectYgmgs(YgmgsEntity ygmgsEntity);

    //添加洗车工订单
    int addXcg_order(xcg_order xcgorder);
    //修改用户订单状态
    int UpdateYhorder(UserOrder userOrder);
}

