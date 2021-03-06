package com.test.gao.cms.Service.impl;

import com.test.gao.cms.Service.StemQuestionInfoService;
import com.test.gao.cms.entity.StemQuestionInfo;
import com.test.gao.cms.mapper.StemQuestionInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StemQuestionInfoServiceImpl implements StemQuestionInfoService {

    @Autowired
    private StemQuestionInfoMapper stemQuestionInfoMapper;

    public List<StemQuestionInfo> selectQuestionById(int questionid) {
        return stemQuestionInfoMapper.findQuestionById(questionid);
    }
}
