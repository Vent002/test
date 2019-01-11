package com.test.gao.cms.Controller;

import cn.hutool.core.util.ObjectUtil;
import com.test.gao.cms.Service.StemInfoService;
import com.test.gao.cms.entity.StemInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/index")
public class ChooseStemController {

@Autowired
private StemInfoService stemInfoService;

//搜索题干
@ResponseBody
@RequestMapping("/selectStemById")
public StemInfo selectByStemId(@RequestParam("stemid") int stemId){
    StemInfo stemInfo = stemInfoService.selectStemById(stemId);
    return stemInfo;
}

//搜索题干的选项 找到就跳到答题页面 否者报错
@RequestMapping(value = "/content",method = RequestMethod.GET)
private String answerQuestion(@RequestParam("stemid") Integer contentid, HttpServletRequest request) {
    StemInfo stemInfo = stemInfoService.selectStemById(contentid);
    request.getSession().setAttribute("stemid",contentid);
    if(ObjectUtil.isNotNull(stemInfo)){
        return "a/home";
    }else{
        return "a/404";
    }
}

}