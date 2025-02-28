package com.kb.lims.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kb.lims.entity.Bench;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.sql.Timestamp;

public interface BenchMapper extends BaseMapper<Bench> {

    @Update("update bench set name = #{bench.name}, location = #{bench.location}, " +
            "project_name = #{bench.projectName}, date_of_purchase = #{bench.dateOfPurchase}, " +
            "manager = #{bench.manager}, state = #{bench.state}, user = #{bench.user}" +
            "where id = #{id}")
    void updateById(@Param("id") int id, @Param("bench") Bench bench);

    @Select("select last_calibration_date from bench where id = #{id}")
    Timestamp getLastCalibrationDate(int id);

    @Select("select calibration_period from bench where id = #{id}")
    Integer getCalibrationPeriod(int id);
}
