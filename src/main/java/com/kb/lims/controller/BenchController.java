package com.kb.lims.controller;

import com.kb.lims.dto.Result;
import com.kb.lims.entity.Bench;
import com.kb.lims.service.BenchService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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

    @PutMapping("/{id}")
    public Result updateBench(@PathVariable int id, @RequestBody Bench bench){
        return benchService.updateBench(id, bench);
    }

    @DeleteMapping("/{id}")
    public Result deleteBench(@PathVariable int id){
        return benchService.deleteBench(id);
    }

}
