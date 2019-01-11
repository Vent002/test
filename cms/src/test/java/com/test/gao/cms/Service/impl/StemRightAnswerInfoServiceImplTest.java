package com.test.gao.cms.Service.impl;

import com.test.gao.cms.Service.StemRightAnswerInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class StemRightAnswerInfoServiceImplTest {
    @Autowired
    private StemRightAnswerInfoService stemRightAnswerInfoService;
    @Test
    public void selectAnswer() {
        System.out.println(stemRightAnswerInfoService.selectAnswer(1001));
    }
}