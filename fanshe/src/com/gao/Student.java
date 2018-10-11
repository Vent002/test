package com.gao;

public class Student {

    private String name;
    private char Id;
    private  int sex;
    private int age;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public char getId() {
//        return Id;
//    }
//
//    public void setId(char id) {
//        Id = id;
//    }
//
//    public int getSex() {
//        return sex;
//    }
//
//    public void setSex(int sex) {
//        this.sex = sex;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }


    // 构造方法
    /*
    是一种特殊的方法，功能是 构造对象
    * 构造方法的名字必须与定义他的类的名字完全相同
    * 没有返回值，没有void，即没有return
    *
    * */

    //默认的构造方法
    Student(String str){
        System.out.println("默认的构造方法S = " +str);
    }

    //无参构造方法
    public Student(){
        System.out.println("调用了公有、无参构造方法执行");
    }
    //有一个参数的构造方法
    public Student(char name){
        System.out.println("姓名："+name);
    }
    //有多个参数的构造方法
    public Student(String name,int age){
        System.out.println("姓名："+name+"年龄"+age);
    }
    //受保护的构造方法
    protected Student(boolean n){
        System.out.println("受保护的构造方法n = "+n);
    }
    //私有的构造方法
    private Student(int age){
        System.out.println("私有的构造方法  性别："+age);
    }
}
