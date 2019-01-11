package com.test.gao.cms.Service.impl;

import com.test.gao.cms.Service.StemInfoService;
import com.test.gao.cms.entity.StemInfo;
import com.test.gao.cms.mapper.StemInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

@Service
@Transactional
public class StemInfoServiceImpl implements StemInfoService {

    @Autowired
    private StemInfoMapper stemInfoMapper;

    public StemInfo selectStemById(int stemid){
        return stemInfoMapper.findStemById(stemid);
    }

    @Override
    public int insertStemContent(int id, int stemId, String stemContent) {

        StemInfo stemInfo = new StemInfo();
        stemInfo.setId(id);
        stemInfo.setStemId(stemId);
        stemInfo.setStemContent(stemContent);

        return stemInfoMapper.insert(stemInfo);
    }
}
