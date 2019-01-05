package com.test.gao.cms.Controller;

import com.test.gao.cms.Service.StemQuestionInfoService;
import com.test.gao.cms.entity.StemQuestionInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/index")
public class IndexController {
    Random random = new Random();
    int sid = random.nextInt(5)%(5-2+1)+1;

    @Autowired
    private StemQuestionInfoService stemQuestionInfoService;

    @ResponseBody
    @RequestMapping("/selectById")
    public List<StemQuestionInfo> selectById(int sid){
        System.out.println("I am coming!!!!");
        List<StemQuestionInfo> stemQuestionInfos = stemQuestionInfoService.selectById(1001);
        return stemQuestionInfos;
    }
}
