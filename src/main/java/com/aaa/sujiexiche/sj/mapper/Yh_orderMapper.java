package com.aaa.sujiexiche.sj.mapper;

import com.aaa.sujiexiche.sj.entity.Yhorder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface Yh_orderMapper {
    //查询所有的方法
    //alt+ enter
    public List<Yhorder> SelectYhorder(Map<String, Object> map);
    /**
     *
     *
     * @return查询总条数
     */
    public Integer selectAllEmpCount(Map<String, Object> map);
}
