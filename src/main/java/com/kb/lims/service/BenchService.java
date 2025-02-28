package com.kb.lims.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kb.lims.dto.Result;
import com.kb.lims.entity.Bench;

public interface BenchService extends IService<Bench> {
    Result getAllBenches();

    Result getBench(int id);

    Result addBench(Bench bench);

    Result updateBench(int id, Bench bench);

    Result deleteBench(int id);

    Result getLastCalibrationDate(int id);

    Result getCalibrationPeriod(int id);
}
