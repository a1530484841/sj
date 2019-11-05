package com.aaa.sujiexiche.sj.service;


import com.aaa.sujiexiche.sj.entity.UserOrder;
import com.aaa.sujiexiche.sj.entity.YgmgsEntity;
import com.aaa.sujiexiche.sj.entity.xcg_order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserOrderService {
    List<UserOrder> selectUserOrder(UserOrder userOrder);
    List<YgmgsEntity> selectYgmgs(YgmgsEntity ygmgsEntity);
    int addXcg_order(xcg_order xcgorder);
    int UpdateYhorder(UserOrder userOrder);
}
