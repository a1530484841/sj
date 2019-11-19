package com.aaa.sujiexiche.sj.service;


import com.aaa.sujiexiche.sj.entity.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserOrderService {
    List<UserOrder> selectUserOrder(UserOrder userOrder);
    List<UserOrder> selectTui(UserOrder userOrder);
    List<YgmgsEntity> selectYgmgs(YgmgsEntity ygmgsEntity);
    int addXcg_order(xcg_order xcgorder);
    int UpdateYhorder(UserOrder userOrder);
    int UpdateYgstyle(YgmgsEntity ygmgsEntity);
    List<xcg_order> selectOrdering(xcg_order xcgorder);
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

    int updateYhorderend(Yhorder yhorder);
    int updatexcgOrderend(xcg_order xcgorder);
    int updateYhorderbz(Yhorder yhorder);
}
