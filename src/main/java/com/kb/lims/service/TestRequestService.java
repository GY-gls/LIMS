package com.kb.lims.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kb.lims.dto.Result;
import com.kb.lims.entity.TestRequest;

public interface TestRequestService extends IService<TestRequest> {

    Result getTestRequest(int id);

    Result addTestRequest(TestRequest testRequest);

    Result updateTestRequest(int id, TestRequest testRequest);

    Result deleteTestRequest(int id);

    Result getUserTestRequests(int id);
}
