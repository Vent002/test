package com.test.gao.cms.Service;

import com.test.gao.cms.entity.StemRightAnswerInfo;

import java.util.List;

public interface StemRightAnswerInfoService {

    //搜索题目的正确答案
    List<StemRightAnswerInfo> selectAnswer(int answerid);
}
