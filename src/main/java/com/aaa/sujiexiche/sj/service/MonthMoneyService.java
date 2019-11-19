package com.aaa.sujiexiche.sj.service;

import com.aaa.sujiexiche.sj.entity.xcg_order;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MonthMoneyService {
    //    获取每个月盈利
    List<xcg_order> getmonth();
}
