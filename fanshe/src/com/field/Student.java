package com.field;

public class Student {
    public Student()
    {

    }
    public String name;
    protected int age;
    char sex;
    private String phone_num;
    @Override
    public String toString(){
        return "com.field.Student \n [name="+name+",\nage="+age+",\nsex="+sex+",\nphoneNum="+phone_num+"]";
    }

}
