package com.test.gao.cms.Service;

import com.test.gao.cms.entity.StemQuestionInfo;

import java.util.List;

public interface StemQuestionInfoService {

    public List<StemQuestionInfo> selectById(int id); //搜索条件为id的用户信息
//    public List<StemQuestionInfo> selectAll(); //搜索全表信息
//
//    public void updateUserInfo(StemQuestionInfo cmsUser);
//
//    public void insertUserInfo(StemQuestionInfo cmsUser);
//
//    public void delete(int id);
}
