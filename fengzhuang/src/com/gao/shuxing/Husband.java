package com.gao.shuxing;

public class Husband {

    private String name;
    private  int age;
    private String sex;
    private Wife wife;

    //setter()和getter()是Husband对象对外的接口;
    //getter()是控制出口
    //setter()是控制进口

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>120){
            System.out.println("Error: error age input!");
        }
        else {
            this.age = age;
        }
    }

    public String getSex() {
        if ("1".equals(sex))
            sex = "男";
        if("0".equals(sex))
            sex = "女";
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }
}
