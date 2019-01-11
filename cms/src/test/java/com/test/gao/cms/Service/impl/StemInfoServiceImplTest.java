package com.test.gao.cms.Service.impl;

import com.test.gao.cms.Service.StemInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class StemInfoServiceImplTest {

    @Autowired
    private StemInfoService stemInfoService;

    @Test
    public void selectAllByStemId() {
        System.out.println(stemInfoService.selectStemById(1001));
    }
}