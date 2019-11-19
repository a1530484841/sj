package com.aaa.sujiexiche.sj.service.serviceimpl;

import com.aaa.sujiexiche.sj.entity.xcg_order;
import com.aaa.sujiexiche.sj.mapper.MonthMoneyMapper;
import com.aaa.sujiexiche.sj.service.MonthMoneyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class MonthMoneyServiceImpl implements MonthMoneyService {
    @Resource
    private MonthMoneyMapper monthMoneyMapper;
    @Override
    public List<xcg_order> getmonth() {
        return monthMoneyMapper.getmonth();
    }
}
