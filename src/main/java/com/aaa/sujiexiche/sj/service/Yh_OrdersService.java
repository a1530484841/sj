package com.aaa.sujiexiche.sj.service;

import com.aaa.sujiexiche.sj.entity.Yhorder;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface Yh_OrdersService {
    List<Yhorder> SelectYhorder(Yhorder yhorder);

}
