package com.kb.lims.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kb.lims.dto.Result;
import com.kb.lims.dto.UserDTO;
import com.kb.lims.entity.User;

public interface UserService extends IService<User> {
    Result getAllUsers();

    Result addUser(UserDTO userDTO);

    Result getPersonType(int id);

    Result updateUser(int id, UserDTO userDTO);

    Result deleteUser(int id);
}
