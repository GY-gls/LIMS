package com.kb.lims.controller;

import com.kb.lims.dto.Result;
import com.kb.lims.entity.Bench;
import com.kb.lims.service.BenchService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/bench")
public class BenchController {

    @Resource
    private BenchService benchService;

    @GetMapping("getAllBenches")
    public Result getAllBenches(){
        return benchService.getAllBenches();
    }

    @GetMapping("/{id}")
    public Result getBench(@PathVariable int id){
        return benchService.getBench(id);
    }

    @PostMapping
    public Result addBench(@RequestBody Bench bench){
        return benchService.addBench(bench);
    }

    @PostMapping("update/{id}")
    public Result updateBench(@PathVariable int id, @RequestBody Bench bench){
        return benchService.updateBench(id, bench);
    }

    @PostMapping("delete/{id}")
    public Result deleteBench(@PathVariable int id){
        return benchService.deleteBench(id);
    }

    @GetMapping("lastCalibrationDate/{id}")
    public Result getLastCalibrationDate(@PathVariable int id) {
        return benchService.getLastCalibrationDate(id);
    }

    @GetMapping("calibrationPeriod/{id}")
    public Result getCalibrationPeriod(@PathVariable int id){
        return benchService.getCalibrationPeriod(id);
    }

    @GetMapping("getAvailableBenches")
    public Result getAvailableBenches(Timestamp startDate, Timestamp endDate){
        return benchService.getAvailableBenches(startDate, endDate);
    }
}
