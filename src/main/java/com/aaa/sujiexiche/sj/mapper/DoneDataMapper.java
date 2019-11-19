package com.aaa.sujiexiche.sj.mapper;

import com.aaa.sujiexiche.sj.entity.xcg_order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DoneDataMapper {
    int getDoneToday();
    int getProceed();
    int getdaixidan();
    int gettuidan();
    List<xcg_order> getTotalAndPrice();
    List<xcg_order> getAllTotalAndPrice(xcg_order xcgOrder);
}
