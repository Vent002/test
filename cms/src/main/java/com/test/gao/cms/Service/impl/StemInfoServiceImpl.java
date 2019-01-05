package com.test.gao.cms.Service.impl;

import com.test.gao.cms.Service.StemInfoService;
import com.test.gao.cms.entity.StemInfo;
import com.test.gao.cms.mapper.StemInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StemInfoServiceImpl implements StemInfoService {

    @Autowired
    private StemInfoMapper stemInfoMapper;

    public StemInfo selectByStemId(int stemid){
        return stemInfoMapper.findByStemId(stemid);
    }
}
