package com.test.gao.cms.entity;

public class StemQuestionInfo {
    private int stemId;
    private int chooseId;
    private String chooseA;
    private String chooseB;
    private String chooseC;
    private String ChooseD;

    public StemQuestionInfo(int stemId, int chooseId, String chooseA, String chooseB, String chooseC, String chooseD){
        this.stemId = stemId;
        this.chooseId = chooseId;
        this.chooseA = chooseA;
        this.chooseB = chooseB;
        this.chooseC = chooseC;
        this.ChooseD = chooseD;
    }
    public StemQuestionInfo(){
        super();
    }
    @Override
    public String toString() {
        return "QuestionSelectInfo{" +
                "stemId=" + stemId +
                ", chooseId=" + chooseId +
                ", chooseA='" + chooseA + '\'' +
                ", chooseB='" + chooseB + '\'' +
                ", chooseC='" + chooseC + '\'' +
                ", ChooseD='" + ChooseD + '\'' +
                '}';
    }

    public int getStemId() {
        return stemId;
    }

    public void setStemId(int stemId) {
        this.stemId = stemId;
    }

    public int getChooseId() {
        return chooseId;
    }

    public void setChooseId(int chooseId) {
        this.chooseId = chooseId;
    }

    public String getChooseA() {
        return chooseA;
    }

    public void setChooseA(String chooseA) {
        this.chooseA = chooseA;
    }

    public String getChooseB() {
        return chooseB;
    }

    public void setChooseB(String chooseB) {
        this.chooseB = chooseB;
    }

    public String getChooseC() {
        return chooseC;
    }

    public void setChooseC(String chooseC) {
        this.chooseC = chooseC;
    }

    public String getChooseD() {
        return ChooseD;
    }

    public void setChooseD(String chooseD) {
        ChooseD = chooseD;
    }
}
