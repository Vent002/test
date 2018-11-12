package com.test.gao.cms.Service.impl;

import com.test.gao.cms.Service.CmsUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CmsUserServiceImplTest {

    @Autowired
    private CmsUserService cmsUserService;
    @Test
    public void selectById() {
        System.out.println(cmsUserService.selectById(3));
    }
}