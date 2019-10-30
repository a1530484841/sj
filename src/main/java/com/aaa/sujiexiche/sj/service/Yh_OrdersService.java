package com.aaa.sujiexiche.sj.service;

import com.aaa.sujiexiche.sj.entity.Yhorder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface Yh_OrdersService {
    List<Yhorder> SelectYhorder(Map<String, Object> map);
    Integer selectEmpCount(Map<String, Object> map);
}
