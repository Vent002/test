package com.gao.shuxing;

public class Wife {

    private String name;
    private int age;
    private String sex;
    private Husband husband;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(age>120){
            System.out.println("Error: error age input!");
        }
        else {
            this.age = age;
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex(){
        if ("1".equals(sex))
            sex = "男";
        if("0".equals(sex))
            sex = "女";
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Husband getHusband() {
        return husband;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }
}
