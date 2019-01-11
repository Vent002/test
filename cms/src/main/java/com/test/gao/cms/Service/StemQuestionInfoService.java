package com.test.gao.cms.Service;

import com.test.gao.cms.entity.StemQuestionInfo;

import java.util.List;

public interface StemQuestionInfoService {

    //搜索条件为id的完形填空的选项
    List<StemQuestionInfo> selectQuestionById(int id);
}
