package com.aaa.sujiexiche.sj.service;

import com.aaa.sujiexiche.sj.entity.xcg_order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DoneDataService {
    int getDoneToday();
    int getProceed();
    int getdaixidan();
    int gettuidan();
    List<xcg_order> getTotalAndPrice();
    List<xcg_order> getAllTotalAndPrice(xcg_order xcgOrder);
}
