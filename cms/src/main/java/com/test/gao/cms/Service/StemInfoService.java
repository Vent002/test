package com.test.gao.cms.Service;

import com.test.gao.cms.entity.StemInfo;


public interface StemInfoService {
    //搜索完形填空的题干
    StemInfo selectStemById(int id);
    //插入完型填空的题干信息
    int insertStemContent(int id, int stemId, String stemContent);
}
