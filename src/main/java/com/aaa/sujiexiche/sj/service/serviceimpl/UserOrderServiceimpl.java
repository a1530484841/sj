package com.aaa.sujiexiche.sj.service.serviceimpl;

import com.aaa.sujiexiche.sj.entity.*;
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
    public int UpdateYgstyle(YgmgsEntity ygmgsEntity) {
        return userOrderMapper.UpdateYgstyle(ygmgsEntity);
    }

    @Override
    public int UpdateYhorder(UserOrder userOrder) {
        return userOrderMapper.UpdateYhorder(userOrder);
    }

    @Override
    public List<xcg_order> selectOrdering(xcg_order xcgorder) {

        return userOrderMapper.selectOrdering(xcgorder);
    }

    @Override
    public int UpdateYhordertwo(UserOrder userOrder) {
        return userOrderMapper.UpdateYhordertwo(userOrder);
    }

    @Override
    public int UpdateYgstyletwo(YgmgsEntity ygmgsEntity) {
        return userOrderMapper.UpdateYgstyletwo(ygmgsEntity);
    }

    @Override
    public int Delexcg_order(int xcg_id) {
        return userOrderMapper.Delexcg_order(xcg_id);
    }

    @Override
    public List<UserOrder> selectTui(UserOrder userOrder) {
        return userOrderMapper.selectTui(userOrder);
    }

    @Override
    public int selectXcgorder(xcg_order xcgorder) {
        return userOrderMapper.selectXcgorder(xcgorder);
    }

    @Override
    public int updateYhorder(Yhorder yhorder) {
        return userOrderMapper.updateYhorder(yhorder);
    }

    @Override
    public int updatexcgOrder(xcg_order xcgorder) {
        return userOrderMapper.updatexcgOrder(xcgorder);
    }

    @Override
    public int updateYh_burse(yh_burse yhburse) {
        return userOrderMapper.updateYh_burse(yhburse);
    }

    @Override
    public int updateYhorderend(Yhorder yhorder) {
        return userOrderMapper.updateYhorderend(yhorder);
    }

    @Override
    public int updatexcgOrderend(xcg_order xcgorder) {
        return userOrderMapper.updatexcgOrderend(xcgorder);
    }

    @Override
    public int updateYhorderbz(Yhorder yhorder) {
        return userOrderMapper.updateYhorderbz(yhorder);
    }
}
