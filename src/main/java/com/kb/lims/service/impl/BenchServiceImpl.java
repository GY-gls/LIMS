package com.kb.lims.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kb.lims.dto.Result;
import com.kb.lims.entity.Bench;
import com.kb.lims.entity.Code;
import com.kb.lims.mapper.BenchMapper;
import com.kb.lims.service.BenchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BenchServiceImpl extends ServiceImpl<BenchMapper, Bench> implements BenchService {

    @Autowired
    private BenchMapper benchMapper;

    /**
     * 获取所有台架信息
     *
     * @return
     */
    @Override
    public Result getAllBenches() {
        List<Bench> benchList = benchMapper.selectList(null);
        if(benchList.isEmpty()) return Result.error(Code.EMPTY_LIST, "台架信息为空");
        return Result.success(benchList);
    }

    /**
     * 根据id查看台架信息
     *
     * @param id
     * @return
     */
    @Override
    public Result getBench(int id) {
        Bench bench = benchMapper.selectById(id);
        return Result.success(bench);
    }

    /**
     * 添加台架
     *
     * @param bench
     * @return
     */
    @Override
    public Result addBench(Bench bench) {
        Result result = validateBenchInfo(bench);
        if(result.isSuccess()) benchMapper.insert(bench);
        return result;
    }

    /**
     * 根据id修改台架
     *
     * @param id
     * @param bench
     * @return
     */
    @Override
    public Result updateBench(int id, Bench bench) {
        Result result = validateBenchInfo(bench);
        if(result.isSuccess()) benchMapper.updateById(id, bench);
        return result;
    }

    /**
     * 根据id删除台架
     *
     * @param id
     * @return
     */
    @Override
    public Result deleteBench(int id) {
        benchMapper.deleteById(id);
        return Result.success(null);
    }


    // 地区，状态，负责人默认有值
    private Result validateBenchInfo(Bench bench) {
        if(bench.getName().isEmpty()) return Result.error(Code.EMPTY_NAME, "台架名称不可为空");
        if(bench.getProjectName().isEmpty()) return Result.error(Code.INVALID_PROJECT_NAME, "项目名称不可为空");
        if(bench.getUser() == null && !bench.getState().equals("空闲")) return Result.error(Code.USER_REQUIRED, "非空闲台架需要填写使用人名称");
        return Result.success(null);
    }
}
