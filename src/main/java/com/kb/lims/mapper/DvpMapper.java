package com.kb.lims.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kb.lims.dto.DvpDTO;
import com.kb.lims.entity.Dvp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface DvpMapper extends BaseMapper<Dvp> {

    void updateById(@Param("id") int id, @Param("dvp") DvpDTO dvp);

    List<Dvp> getDvpByUserId(int id);

    @Select("select * from dvp where id = #{id}")
    Dvp selectDvpById(int id);

    void addDvp(DvpDTO dvp);
}
