package com.kb.lims.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kb.lims.dto.Result;
import com.kb.lims.dto.UserDTO;
import com.kb.lims.entity.Code;
import com.kb.lims.entity.User;
import com.kb.lims.mapper.UserMapper;
import com.kb.lims.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
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
    public Result getAllUsers() {
//        UserMapper userMapper1 = new UserMapper();
        List<User> userList = userMapper.selectList(null);
        if (userList.size() == 0) {
            return Result.error(Code.EMPTY_LIST, "用户信息为空");
        }
        userList.forEach(System.out::println);
        return Result.success(userList);
    }

    /**
     * 添加用户
     *
     * @param userDTO
     * @return
     */
    @Override
    public Result addUser(UserDTO userDTO){
        Result result = validateUserInfo(userDTO);
        if(result.isSuccess()) {
            User user = new User();
            BeanUtils.copyProperties(userDTO, user);
            user.setCreatedAt(new Timestamp(System.currentTimeMillis()));
            userMapper.insert(user);
        }
        return result;
    }

    /**
     * 根据id查询用户的权限
     *
     * @param id
     * @return
     */
    @Override
    public Result getPersonType(int id){
        User user = userMapper.selectById(id);
        return Result.success(user.getPersonType());
    }

    /**
     * 根据id修改用户信息
     *
     * @param id
     * @param userDTO
     * @return
     */
    @Override
    public Result updateUser(int id, UserDTO userDTO){
        Result result = validateUserInfo(userDTO);
        if(result.isSuccess()) userMapper.updateById(id, userDTO);
        return result;
    }

    /**
     * 根据id删除用户
     *
     * @param id
     * @return
     */
    @Override
    public Result deleteUser(int id) {
        userMapper.deleteById(id);
        return Result.success(null);
    }

    // helper functions for addUser and updateUser
    private Result validateUserInfo(UserDTO userDTO){
        if(userDTO.getName().isEmpty()) return Result.error(Code.EMPTY_NAME, "用户名称不可为空");
        if(!validPhone(userDTO.getPhone())) return Result.error(Code.INVALID_PHONE, "手机号码格式错误");
        if(!validEmail(userDTO.getEmail())) return Result.error(Code.INVALID_EMAIL, "邮箱地址格式错误");
        if(!validPersonType(userDTO.getPersonType())) {
            return Result.error(Code.INVALID_PERSON_TYPE, "用户权限格式错误：请输入0到3之间的数字");
        }
        return Result.success(null);
    }

    private boolean validPhone(String phone) {
        int len = phone.length();
        // 确认电话号码是11位
        if(len != 11) return false;
        // 确认电话号码都由数字组成
        for(int i = 0; i < len; i++){
            if(!Character.isDigit(phone.charAt(i))) return false;
        }
        return true;
    }

    private boolean validEmail(String email) {
        return email.endsWith("@knorr-bremse.com");
    }

    private boolean validPersonType(String personType) {
        int type = Integer.parseInt(personType);
        return type >= 0 && type <= 3;
    }
}
