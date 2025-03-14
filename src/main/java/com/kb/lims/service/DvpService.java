package com.kb.lims.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kb.lims.dto.DvpDTO;
import com.kb.lims.dto.Result;
import com.kb.lims.entity.Dvp;

public interface DvpService extends IService<Dvp> {

    Result getDvp(int id);

    Result addDvp(DvpDTO dvpDto);

    Result updateDvp(int id, DvpDTO dvpDto);

    Result deleteDvp(int id);

    Result getUserDvp(int id);
}
