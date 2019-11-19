package com.aaa.sujiexiche.sj.mapper;

import com.aaa.sujiexiche.sj.entity.YgmgsEntity;
import com.aaa.sujiexiche.sj.entity.Yhorder;
import com.aaa.sujiexiche.sj.entity.xcg_order;
import org.apache.ibatis.annotations.Mapper;
import com.aaa.sujiexiche.sj.entity.yh_users;
import java.util.List;


@Mapper
public interface Yh_orderMapper {
    //查询已完成订单的方法
    List<xcg_order> SelectYhorder(xcg_order xcgOrder);
    //查询用户信息
    List<yh_users> SelectYhusers(yh_users yhusers);
    //查询洗车工信息
    List<YgmgsEntity> SelectYgmgs(YgmgsEntity ygmgsEntity);
    //修改洗车工信息
    int UpdateYgmgs(YgmgsEntity ygmgsEntity);
    //添加洗车工信息
    int AddYgmgs(YgmgsEntity ygmgsEntity);
    //删除洗车工
    int DeleYgmgs(YgmgsEntity ygmgsEntity);

}
