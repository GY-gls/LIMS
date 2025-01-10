package com.kb.lims.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kb.lims.dto.Result;
import com.kb.lims.entity.User;
import com.kb.lims.mapper.UserMapper;
import com.kb.lims.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;
    /**
     * 获取所有用户信息
     *
     * 该方法通过调用userMapper的selectList方法，传入null作为查询条件，来获取所有用户信息
     * 使用null作为参数是因为MyBatis1-Plus框架默认此情况下查询整个表的数据
     *
     * @return 返回包含所有用户信息的Result对象
     */
    @Override
    public Result getAllUser() {
//        UserMapper userMapper1 = new UserMapper();
        List<User> userList = userMapper.selectList(null);
        if (userList.size() == 0) {
            return Result.error(301, "用户信息为空");
        }
        userList.forEach(System.out::println);
        return Result.success(userList);
    }
}
