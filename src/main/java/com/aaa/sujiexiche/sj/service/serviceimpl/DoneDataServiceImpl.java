package com.aaa.sujiexiche.sj.service.serviceimpl;

import com.aaa.sujiexiche.sj.entity.xcg_order;
import com.aaa.sujiexiche.sj.mapper.DoneDataMapper;
import com.aaa.sujiexiche.sj.service.DoneDataService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DoneDataServiceImpl implements DoneDataService {
    @Resource
    private DoneDataMapper doneDataMapper;
    @Override
    public int getDoneToday() {
        return doneDataMapper.getDoneToday();
    }

    @Override
    public int getProceed() {
        return doneDataMapper.getProceed();
    }

    @Override
    public List<xcg_order> getTotalAndPrice() {
        return doneDataMapper.getTotalAndPrice();
    }

    @Override
    public int getdaixidan() {
        return doneDataMapper.getdaixidan();
    }

    @Override
    public int gettuidan() {
        return doneDataMapper.gettuidan();
    }

    @Override
    public List<xcg_order> getAllTotalAndPrice(xcg_order xcgOrder) {
        return doneDataMapper.getAllTotalAndPrice(xcgOrder);
    }
}
