package com.test.gao.cms.Service.impl;

import com.test.gao.cms.Service.StemRightAnswerInfoService;
import com.test.gao.cms.entity.StemRightAnswerInfo;
import com.test.gao.cms.mapper.StemRightAnswerInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class StemRightAnswerInfoServiceImpl implements StemRightAnswerInfoService {
    @Autowired
    public StemRightAnswerInfoMapper stemRightAnswerInfoMapper;

    public List<StemRightAnswerInfo> selectAnswer(int answerid){
        return stemRightAnswerInfoMapper.findAnswerById(answerid);
    }
}
