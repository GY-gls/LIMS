package com.kb.lims.controller;

import com.kb.lims.dto.DvpDTO;
import com.kb.lims.dto.Result;
import com.kb.lims.entity.Dvp;
import com.kb.lims.service.DvpService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/dvp")
public class DvpController {

    @Resource
    private DvpService dvpService;

    // 不同于getAll，一个用户只需要看到他们自己的dvp，不需要看到所有的
    // 这里的id是用户的id，如果给了null的话就返回所有的dvp（admin或许需要这么做）
    @GetMapping("getUserDvp/{id}")
    public Result getUserDvp(@PathVariable int id){
        return dvpService.getUserDvp(id);
    }

    @GetMapping("/{id}")
    public Result getDvp(@PathVariable int id){
        return dvpService.getDvp(id);
    }

    @PostMapping
    public Result addDvp(@RequestBody DvpDTO dvpDto){
        return dvpService.addDvp(dvpDto);
    }

    @PostMapping("update/{id}")
    public Result updateDvp(@PathVariable int id, @RequestBody DvpDTO dvpDto){
        return dvpService.updateDvp(id, dvpDto);
    }

    @PostMapping("delete/{id}")
    public Result deleteDvp(@PathVariable int id){
        return dvpService.deleteDvp(id);
    }

}
