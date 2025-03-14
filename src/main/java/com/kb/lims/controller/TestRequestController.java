package com.kb.lims.controller;

import com.kb.lims.dto.Result;
import com.kb.lims.entity.TestRequest;
import com.kb.lims.service.TestRequestService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/testRequest")
public class TestRequestController {

    @Resource
    private TestRequestService testRequestService;

    // 这个id是用户的id, 可以查看该用户的test requests
    // 给null的话返回系统内所有test requests
    @GetMapping("getUserTestRequests/{id}")
    public Result getUserTestRequests(@PathVariable int id){
        return testRequestService.getUserTestRequests(id);
    }

    @GetMapping("/{id}")
    public Result getTestRequest(@PathVariable int id){
        return testRequestService.getTestRequest(id);
    }

    @PostMapping
    public Result addTestRequest(@RequestBody TestRequest testRequest){
        return testRequestService.addTestRequest(testRequest);
    }

    @PostMapping("update/{id}")
    public Result updateTestRequest(@PathVariable int id, @RequestBody TestRequest testRequest){
        return testRequestService.updateTestRequest(id, testRequest);
    }

    @PostMapping("delete/{id}")
    public Result deleteTestRequest(@PathVariable int id){
        return testRequestService.deleteTestRequest(id);
    }
}
