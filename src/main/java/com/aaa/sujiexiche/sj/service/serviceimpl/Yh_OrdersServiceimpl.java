package com.aaa.sujiexiche.sj.service.serviceimpl;

import com.aaa.sujiexiche.sj.entity.Yhorder;
import com.aaa.sujiexiche.sj.mapper.Yh_orderMapper;
import com.aaa.sujiexiche.sj.service.Yh_OrdersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class Yh_OrdersServiceimpl implements Yh_OrdersService {
    @Resource
    Yh_orderMapper yh_orderMapper;

    @Override
    public List<Yhorder> SelectYhorder(Map<String, Object> map) {
        List<Yhorder> orderlist=yh_orderMapper.SelectYhorder(map);

        return orderlist;
    }

    @Override
    public Integer selectEmpCount(Map<String, Object> map) {
        Integer count=yh_orderMapper.selectAllEmpCount(map);
        return count;
    }
}
