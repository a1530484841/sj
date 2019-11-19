package com.aaa.sujiexiche.sj.service;

import com.aaa.sujiexiche.sj.entity.YgmgsEntity;

import com.aaa.sujiexiche.sj.entity.xcg_order;
import com.aaa.sujiexiche.sj.entity.yh_users;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface Yh_OrdersService {
    List<xcg_order> SelectYhorder(xcg_order xcgOrder);
    List<yh_users> SelectYhusers(yh_users yhusers);
    List<YgmgsEntity> SelectYgmgs(YgmgsEntity ygmgsEntity);
    int UpdateYgmgs(YgmgsEntity ygmgsEntity);
    //添加洗车工信息
    int AddYgmgs(YgmgsEntity ygmgsEntity);
    //删除洗车工
    int DeleYgmgs(YgmgsEntity ygmgsEntity);

}
