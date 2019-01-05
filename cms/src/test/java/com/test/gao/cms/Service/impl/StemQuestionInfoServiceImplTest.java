package com.test.gao.cms.Service.impl;

import com.test.gao.cms.Service.StemQuestionInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
@RunWith(SpringRunner.class)
public class StemQuestionInfoServiceImplTest {

    @Autowired
    private StemQuestionInfoService stemQuestionInfoService;
    @Test
    public void selectById() {
        System.out.println(stemQuestionInfoService.selectById(1001));
    }

//    @Test
//    public void selectAll() {
//        System.out.println(stemQuestionInfoService.selectAll());
//    }
//
//
//    @Test
//    public void updateUserInfo() {
//        StemQuestionInfo cmsUser = stemQuestionInfoService.selectById(6);
//        cmsUser.setUserSex(1);
//        stemQuestionInfoService.updateUserInfo(cmsUser);
//    }
//
//    @Test
//    public void insertUserInfo() {
//        StemQuestionInfo cmsUser = new StemQuestionInfo();
//        cmsUser.setUserName("Insert");
//        cmsUser.setUserAge("23");
//        cmsUser.setUserSex(1);
//        stemQuestionInfoService.insertUserInfo(cmsUser);
//
//    }
//    @Test
//    public void delete(){
//        stemQuestionInfoService.delete(3);
//    }
}