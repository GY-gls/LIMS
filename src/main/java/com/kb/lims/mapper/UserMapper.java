package com.kb.lims.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kb.lims.dto.UserDTO;
import com.kb.lims.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface UserMapper extends BaseMapper<User> {

    @Update("update user set name = #{userDTO.name}, phone = #{userDTO.phone}, email = #{userDTO.email}, " +
            "person_type = #{userDTO.personType} where id = #{id}")
    void updateById(@Param("id") int id, @Param("userDTO") UserDTO userDTO);
}
