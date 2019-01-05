package com.test.gao.cms.entity;

public class StemInfo {
    private Integer id;
    private Integer stemId;
    private String stemContent;

    public StemInfo(Integer id,Integer stemId,String stemContent){
        this.id = id;
        this.stemId = stemId;
        this.stemContent = stemContent;
    }

    @Override
    public String toString(){
        return "stemInfo{"+
                ",id='"+ id + '\'' +
                ",stemId='"+ stemId +'\''+
                "stemContent="+stemContent;
    }

    public StemInfo(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStemId() {
        return stemId;
    }

    public void setStemId(int stemId) {
        this.stemId = stemId;
    }

    public String getStemContent() {
        return stemContent;
    }

    public void setStemContent(String stemContent) {
        this.stemContent = stemContent;
    }
}
