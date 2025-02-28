package com.kb.lims.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kb.lims.dto.Result;
import com.kb.lims.entity.Code;
import com.kb.lims.entity.Sample;
import com.kb.lims.mapper.SampleMapper;
import com.kb.lims.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleServiceImpl extends ServiceImpl<SampleMapper, Sample> implements SampleService {

    @Autowired
    private SampleMapper sampleMapper;

    /**
     * 获取所有样件信息
     *
     * @return
     */
    @Override
    public Result getAllSamples() {
        List<Sample> sampleList = sampleMapper.selectList(null);
        if(sampleList.isEmpty()) return Result.error(Code.EMPTY_LIST, "样件信息为空");
        return Result.success(sampleList);
    }

    /**
     * 根据id获取样件
     *
     * @param id
     * @return
     */
    @Override
    public Result getSample(int id) {
        Sample sample = sampleMapper.selectById(id);
        return Result.success(sample);
    }

    /**
     * 添加样件
     *
     * @param sample
     * @return
     */
    @Override
    public Result addSample(Sample sample) {
        Result result = validateSampleInfo(sample);
        if(result.isSuccess()) sampleMapper.insert(sample);
        return result;
    }

    /**
     * 根据id修改样件信息
     *
     * @param id
     * @param sample
     * @return
     */
    @Override
    public Result updateSample(int id, Sample sample) {
        Result result = validateSampleInfo(sample);
        if(result.isSuccess()) sampleMapper.updateById(id, sample);
        return result;
    }

    /**
     * 根据id删除样件
     *
     * @param id
     * @return
     */
    @Override
    public Result deleteSample(int id) {
        sampleMapper.deleteById(id);
        return Result.success(null);
    }

    private Result validateSampleInfo(Sample sample){
        if(sample.getProjectName().isEmpty()) return Result.error(Code.INVALID_PROJECT_NAME, "所属项目名称不可为空");
        if(sample.getModel().isEmpty()) return Result.error(Code.EMPTY_MODEL, "型号不可为空");
        if(sample.getInitiator().isEmpty()) return Result.error(Code.EMPTY_INITIATOR, "发起人不可为空");
        if(sample.getInitiatorDepartment().isEmpty()) return Result.error(Code.EMPTY_INITIATOR_DEPARTMENT, "发起人部门不可为空");
        if(sample.getReceiver().isEmpty()) return Result.error(Code.EMPTY_RECEIVER, "接受人不可为空");
        if(sample.getReceiverDepartment().isEmpty()) return Result.error(Code.EMPTY_RECEIVER_DEPARTMENT, "接受人部门不可为空");
        if(sample.getNumber() <= 0) return Result.error(Code.INVALID_NUMBER, "数量不可小于0");
        return Result.success(null);
    }

}
