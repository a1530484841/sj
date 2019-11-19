package com.aaa.sujiexiche.sj.mapper;

import com.aaa.sujiexiche.sj.entity.UserOrder;
import com.aaa.sujiexiche.sj.entity.yh_burse;
import com.aaa.sujiexiche.sj.entity.YgmgsEntity;
import com.aaa.sujiexiche.sj.entity.Yhorder;
import com.aaa.sujiexiche.sj.entity.xcg_order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserOrderMapper {
    //查询用户提交的洗车订单
    List<UserOrder> selectUserOrder(UserOrder userOrder);
    //查看用户申请的退款订单
    List<UserOrder> selectTui(UserOrder userOrder);
    //查询空闲以及负责区域和当前用户同步的员工
    List<YgmgsEntity> selectYgmgs(YgmgsEntity ygmgsEntity);

    //添加洗车工订单
    int addXcg_order(xcg_order xcgorder);
    //修改用户订单状态
    int UpdateYhorder(UserOrder userOrder);
    //修改洗车工工作状态
    int UpdateYgstyle(YgmgsEntity ygmgsEntity);
     //查看进行中订单
    List<xcg_order> selectOrdering(xcg_order xcgorder);
    //取消订单
    int UpdateYhordertwo(UserOrder userOrder);
    int UpdateYgstyletwo(YgmgsEntity ygmgsEntity);
    int Delexcg_order(int xcg_id);


    //退款
    int selectXcgorder(xcg_order xcgorder);
    //修改用户订单的状态为退款状态
    int updateYhorder(Yhorder yhorder);
    //修改派过单的用户订单状态
    int updatexcgOrder(xcg_order xcgorder);
    //修改用户的钱包金额
    int updateYh_burse(yh_burse yhburse);
    //驳回
    int updateYhorderend(Yhorder yhorder);
    int updatexcgOrderend(xcg_order xcgorder);
    int updateYhorderbz(Yhorder yhorder);
}

