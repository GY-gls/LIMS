package com.kb.lims.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kb.lims.dto.Result;
import com.kb.lims.entity.Sample;


public interface SampleService extends IService<Sample> {
    Result getAllSamples();

    Result getSample(int id);

    Result addSample(Sample sample);

    Result updateSample(int id, Sample sample);

    Result deleteSample(int id);
}
