package com.kb.lims.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kb.lims.dto.Result;
import com.kb.lims.entity.User;

public interface UserService extends IService<User> {
    Result getAllUser();
}
