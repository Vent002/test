package com.exam.stem.last.service.impl;

import com.exam.stem.last.entity.StemContentInfo;
import com.exam.stem.last.mapper.StemContentInfoMapper;
import com.exam.stem.last.service.StemContentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StemContentInfoServiceImpl implements StemContentInfoService {
    @Autowired
    StemContentInfoMapper stemContentInfoMapper;

    public StemContentInfo selectById(int id){
        return stemContentInfoMapper.findById(id);
    }
}
