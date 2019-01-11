package com.test.gao.cms.entity;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class StemQuestionInfo {
    private int stemId;
    private int chooseId;
    private String chooseA;
    private String chooseB;
    private String chooseC;
    private String ChooseD;

}
