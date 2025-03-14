package com.kb.lims.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kb.lims.entity.TestRequest;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TestRequestMapper extends BaseMapper<TestRequest> {
    List<TestRequest> getTestRequestsByUserId(int id);

    void updateById(@Param("id") int id, @Param("tr") TestRequest testRequest);

    @Select("select * from test_request where id = #{id}")
    TestRequest selectById(int id);

    void addTestRequest(TestRequest testRequest);
}
