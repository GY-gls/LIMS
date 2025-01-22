package com.kb.lims.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kb.lims.entity.Bench;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface BenchMapper extends BaseMapper<Bench> {

    @Update("update bench set name = #{bench.name}, location = #{bench.location}, " +
            "project_name = #{bench.projectName}, date_of_purchase = #{bench.dateOfPurchase}, " +
            "manager = #{bench.manager}, state = #{bench.state}, user = #{bench.user}" +
            "where id = #{id}")
    void updateById(@Param("id") int id, @Param("bench") Bench bench);
}
