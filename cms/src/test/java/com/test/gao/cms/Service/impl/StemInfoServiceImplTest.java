package com.test.gao.cms.Service.impl;

import com.test.gao.cms.Service.StemInfoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class StemInfoServiceImplTest {

    @Autowired
    private StemInfoService stemInfoService;

    @Test
    public void selectAllByStemId() {
        System.out.print(stemInfoService.selectByStemId(1001));
    }
}