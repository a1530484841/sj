package com.aaa.sujiexiche.sj.service.serviceimpl;

import com.aaa.sujiexiche.sj.entity.UserOrder;
import com.aaa.sujiexiche.sj.entity.YgmgsEntity;
import com.aaa.sujiexiche.sj.entity.xcg_order;
import com.aaa.sujiexiche.sj.mapper.UserOrderMapper;
import com.aaa.sujiexiche.sj.service.UserOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserOrderServiceimpl implements UserOrderService {
    @Resource
    UserOrderMapper userOrderMapper;
    @Override
    public List<UserOrder> selectUserOrder(UserOrder userOrder) {
        return userOrderMapper.selectUserOrder(userOrder);
    }

    @Override
    public List<YgmgsEntity> selectYgmgs(YgmgsEntity ygmgsEntity) {
        return userOrderMapper.selectYgmgs(ygmgsEntity);

    }

    @Override
    public int addXcg_order(xcg_order xcgorder) {

        return userOrderMapper.addXcg_order(xcgorder);
    }

    @Override
    public int UpdateYhorder(UserOrder userOrder) {
        return userOrderMapper.UpdateYhorder(userOrder);
    }
}
