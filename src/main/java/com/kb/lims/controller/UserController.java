package com.kb.lims.controller;


import com.kb.lims.dto.Result;
import com.kb.lims.dto.UserDTO;
import com.kb.lims.entity.User;
import com.kb.lims.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Time;
import java.sql.Timestamp;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("getAllUsers")
    public Result getAllUsers(){
        System.out.println("run---------------------");
        return userService.getAllUsers();
    }

    @PostMapping
    public Result addUser(@RequestBody UserDTO userDTO){
        return userService.addUser(userDTO);
    }

    @GetMapping("getPersonType/{id}")
    public Result getPersonType(@PathVariable int id){
        return userService.getPersonType(id);
    }

    @PostMapping("update/{id}")
    public Result updateUser(@PathVariable int id, @RequestBody UserDTO userDTO) {
        return userService.updateUser(id, userDTO);
    }

    @PostMapping("delete/{id}")
    public Result deleteUser(@PathVariable int id) {
        return userService.deleteUser(id);
    }

}
