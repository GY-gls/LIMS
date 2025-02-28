package com.kb.lims.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kb.lims.entity.Sample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface SampleMapper extends BaseMapper<Sample> {

    @Update("update sample set project_name = #{sample.projectName}, model = #{sample.model}, " +
            "number = #{sample.number}, initiator = #{sample.initiator}, initiator_department = #{sample.initiatorDepartment}, " +
            "receiver = #{sample.receiver}, receiver_department = #{sample.receiverDepartment}, " +
            "initiate_date = #{sample.initiateDate}, receive_date = #{sample.receiveDate} where id = #{id}")
    void updateById(@Param("id") int id, @Param("sample") Sample sample);
}
