package com.kb.lims.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kb.lims.dto.DvpDTO;
import com.kb.lims.dto.Result;
import com.kb.lims.entity.Dvp;
import com.kb.lims.mapper.DvpMapper;
import com.kb.lims.service.DvpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DvpServiceImpl extends ServiceImpl<DvpMapper, Dvp> implements DvpService {

    @Autowired
    private DvpMapper dvpMapper;

    /**
     * 根据id查询某一个dvp的信息
     *
     * @param id
     * @return
     */
    @Override
    public Result getDvp(int id) {
        Dvp dvp = dvpMapper.selectDvpById(id);
        return Result.success(dvp);
    }

    /**
     * 新增dvp
     *
     * @param dvpDto
     * @return
     */
    @Override
    public Result addDvp(DvpDTO dvpDto) {
        Result result = validateDvpInfo(dvpDto);
        if(result.isSuccess()) dvpMapper.addDvp(dvpDto);
        return result;
    }

    /**
     * 根据id修改dvp信息
     *
     * @param id
     * @param dvpDto
     * @return
     */
    @Override
    public Result updateDvp(int id, DvpDTO dvpDto) {
        Result result = validateDvpInfo(dvpDto);
        if(result.isSuccess()) dvpMapper.updateById(id, dvpDto);
        return result;
    }

    /**
     * 根据id删除dvp
     *
     * @param id
     * @return
     */
    @Override
    public Result deleteDvp(int id) {
        dvpMapper.deleteById(id);
        return Result.success(null);
    }

    /**
     * 根据用户id获取对应的dvp
     * 如果没有提供id，则返回系统内所有dvp
     *
     * @param id
     * @return
     */
    @Override
    public Result getUserDvp(int id) {
        List<Dvp> list = dvpMapper.getDvpByUserId(id);
        return Result.success(list);
    }

    private Result validateDvpInfo(DvpDTO dvpDto){
        // TODO

        return Result.success(null);
    }
}
