package com.test.gao.cms.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString

public class StemRightAnswerInfo {
    private int stemId;
    private int chooseId;
    private String rightAnswer;
    private String answeranalysis;

}
