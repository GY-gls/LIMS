package com.kb.lims.controller;

import com.kb.lims.dto.Result;
import com.kb.lims.entity.Sample;
import com.kb.lims.service.SampleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/sample")
public class SampleController {

    @Resource
    private SampleService sampleService;

    @GetMapping("/getAllSamples")
    public Result getAllSamples(){
        return sampleService.getAllSamples();
    }

    @GetMapping("/{id}")
    public Result getSample(@PathVariable int id){
        return sampleService.getSample(id);
    }

    @PostMapping
    public Result addSample(@RequestBody Sample sample){
        return sampleService.addSample(sample);
    }

    @PutMapping("/{id}")
    public Result updateSample(@PathVariable int id, @RequestBody Sample sample){
        return sampleService.updateSample(id, sample);
    }

    @DeleteMapping("/{id}")
    public Result deleteSample(@PathVariable int id){
        return sampleService.deleteSample(id);
    }
}
