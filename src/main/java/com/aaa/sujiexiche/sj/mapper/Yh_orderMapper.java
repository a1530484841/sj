package com.aaa.sujiexiche.sj.mapper;

import com.aaa.sujiexiche.sj.entity.Yhorder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface Yh_orderMapper {
    //查询已完成订单的方法
    //alt+ enter
    List<Yhorder> SelectYhorder(Yhorder yhorder);

}
