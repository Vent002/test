package com.test.gao.cms.Controller;

import com.test.gao.cms.Service.StemQuestionInfoService;
import com.test.gao.cms.Service.StemRightAnswerInfoService;
import com.test.gao.cms.entity.StemQuestionInfo;
import com.test.gao.cms.entity.StemRightAnswerInfo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@Data
class QuestionAndAnswer{
   List<StemQuestionInfo> stemQuestionInfos;
   List<StemRightAnswerInfo> stemRightAnswerInfos;
}

@Controller
@RequestMapping("/result")
public class IndexStemController {

    @Autowired
    private StemQuestionInfoService stemQuestionInfoService;

    @Autowired
    private StemRightAnswerInfoService stemRightAnswerInfoService;

    @ResponseBody
    @RequestMapping("/stemQuestionInfo")
    private QuestionAndAnswer selectById(@RequestParam("stemid") Integer contentid) {
        //查问题选项和答案
        //将答案和选项存入一个实体类中；

        QuestionAndAnswer questionAnswer = new QuestionAndAnswer();
        List<StemQuestionInfo> stemQuestionInfo = stemQuestionInfoService.selectQuestionById(contentid);

        List<StemRightAnswerInfo> stemRightAnswerInfos = stemRightAnswerInfoService.selectAnswer(contentid);

        questionAnswer.setStemQuestionInfos(stemQuestionInfo);
        questionAnswer.setStemRightAnswerInfos(stemRightAnswerInfos);

        return questionAnswer;
    }

}
