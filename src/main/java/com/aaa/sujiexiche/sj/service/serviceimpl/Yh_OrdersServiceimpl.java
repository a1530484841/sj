package com.aaa.sujiexiche.sj.service.serviceimpl;

import com.aaa.sujiexiche.sj.entity.YgmgsEntity;

import com.aaa.sujiexiche.sj.entity.xcg_order;
import com.aaa.sujiexiche.sj.entity.yh_users;
import com.aaa.sujiexiche.sj.mapper.Yh_orderMapper;
import com.aaa.sujiexiche.sj.service.Yh_OrdersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class Yh_OrdersServiceimpl implements Yh_OrdersService {
    @Resource
    Yh_orderMapper yh_orderMapper;

    @Override
    public List<xcg_order> SelectYhorder(xcg_order xcgOrder) {
        return yh_orderMapper.SelectYhorder(xcgOrder);
    }

    @Override
    public List<yh_users> SelectYhusers(yh_users yhusers) {

        return yh_orderMapper.SelectYhusers(yhusers);
    }

    @Override
    public List<YgmgsEntity> SelectYgmgs(YgmgsEntity ygmgsEntity) {
        return yh_orderMapper.SelectYgmgs(ygmgsEntity);
    }

    @Override
    public int UpdateYgmgs(YgmgsEntity ygmgsEntity) {
        return yh_orderMapper.UpdateYgmgs(ygmgsEntity);
    }

    @Override
    public int AddYgmgs(YgmgsEntity ygmgsEntity) {
        return yh_orderMapper.AddYgmgs(ygmgsEntity);
    }

    @Override
    public int DeleYgmgs(YgmgsEntity ygmgsEntity) {
        return yh_orderMapper.DeleYgmgs(ygmgsEntity);
    }
}
