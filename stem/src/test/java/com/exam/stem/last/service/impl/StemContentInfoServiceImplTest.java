package com.exam.stem.last.service.impl;

import com.exam.stem.last.service.StemContentInfoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class StemContentInfoServiceImplTest {

    @Autowired
    StemContentInfoService stemContentInfoService;
    @Test
    public void selectById() {
        System.out.print(stemContentInfoService.selectById(1));
    }
}