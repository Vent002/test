package com.test.gao.cms.Controller;

import com.test.gao.cms.Service.StemInfoService;
import com.test.gao.cms.entity.StemInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
@RequestMapping("/admin")
public class InsertStemController {

@Autowired
StemInfoService stemInfoService;

@RequestMapping("insert")
@ResponseBody
public String getStemIntoDb(@RequestParam("stemId") Integer stemId,
                            @RequestParam("stemContent") String stemContent) {
    Random rand = new Random();
    int id =  rand.nextInt(1000) +1;

stemInfoService.insertStemContent(id,stemId,stemContent);
    return "success";
}

}
