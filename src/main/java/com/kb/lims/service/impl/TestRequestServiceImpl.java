package com.kb.lims.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kb.lims.dto.Result;
import com.kb.lims.entity.TestRequest;
import com.kb.lims.mapper.TestRequestMapper;
import com.kb.lims.service.TestRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestRequestServiceImpl extends ServiceImpl<TestRequestMapper, TestRequest> implements TestRequestService {

    @Autowired
    private TestRequestMapper testRequestMapper;

    /**
     * 根据id获取测试申请的信息
     *
     * @param id
     * @return
     */
    @Override
    public Result getTestRequest(int id) {
        TestRequest testRequest = testRequestMapper.selectById(id);
        return Result.success(testRequest);
    }

    /**
     * 添加测试申请
     *
     * @param testRequest
     * @return
     */
    @Override
    public Result addTestRequest(TestRequest testRequest) {
        Result result = validateTestRequestInfo(testRequest);
        if(result.isSuccess()) testRequestMapper.addTestRequest(testRequest);
        return result;
    }

    /**
     * 根据id修改测试申请信息
     *
     * @param id
     * @param testRequest
     * @return
     */
    @Override
    public Result updateTestRequest(int id, TestRequest testRequest) {
        Result result = validateTestRequestInfo(testRequest);
        if(result.isSuccess()) testRequestMapper.updateById(id, testRequest);
        return result;
    }

    /**
     * 根据id删除测试申请
     *
     * @param id
     * @return
     */
    @Override
    public Result deleteTestRequest(int id) {
        testRequestMapper.deleteById(id);
        return Result.success(null);
    }

    /**
     * 根据用户id返回对应test requests
     * 如果id为null，返回所有test requests
     *
     * @param id
     * @return
     */
    @Override
    public Result getUserTestRequests(int id) {
        List<TestRequest> list = testRequestMapper.getTestRequestsByUserId(id);
        return Result.success(list);
    }

    private Result validateTestRequestInfo(TestRequest testRequest){
        // TODO

        return Result.success(null);
    }
}
