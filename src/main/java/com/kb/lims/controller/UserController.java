package com.kb.lims.controller;


import com.kb.lims.dto.Result;
import com.kb.lims.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @GetMapping("getUser")
    public Result getUser(){
        System.out.println("run---------------------");
        return userService.getAllUser();
    }
}
