package com.aaa.sujiexiche.sj.mapper;

import com.aaa.sujiexiche.sj.entity.xcg_order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MonthMoneyMapper {
    //    获取每个月盈利
    List<xcg_order> getmonth();
    //   获取每个员工当天单数，和工资
}
