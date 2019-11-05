package com.aaa.sujiexiche.sj.service.serviceimpl;

import com.aaa.sujiexiche.sj.entity.Yhorder;
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
    public List<Yhorder> SelectYhorder(Yhorder yhorder) {

        return   yh_orderMapper.SelectYhorder(yhorder);
    }
}
