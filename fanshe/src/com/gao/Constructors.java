package com.gao;

import java.lang.reflect.Constructor;
/**
* 通过反射获取构造方法并使用
* 通过Class对象可以获取某个类中的：构造方法、成员变量、成员方法；并访问成员；
*
*1.获取构造方法：
*           1):批量的方法：
*                   public Constructor[] getConstructor(); 获取所有"公有的"构造方法;
*                   public Constructor[] getDeclaredConstructor(); 获取所有的构造方法（包括私有、受保护、默认、公有）;
*
*           2):获取单个构造方法并调用
*                   public Constructor getConstructor(Class... parameterTypes); 获取单个"公有的"构造方法;
*                   public Constructor getDeclaredConstructor(Class ... parameterTypes);获取单个构造方法（包括私有、受保护、默认、公有）;
*
*               调用构造方法：
*                   Constructor -->newInstance(Object...initargs);
* */

public class Constructors {
    public static void main(String[] args) throws Exception{
        //加载Class对象
        Class cla = Class.forName("com.gao.Student");
        //获取所有公共构造方法
        System.out.println("++++++++++++++++++所有的构造方法++++++++++++++++++");
        Constructor[] constructors = cla.getConstructors();
        for (Constructor c : constructors){
            System.out.println(c);
        }
        //获取所有的私有、受保护的、默认的构造方法
        System.out.println("++++++++++++++++++所有的私有、受保护的、默认的构造方法+++++++++++++");
        constructors = cla.getDeclaredConstructors();
        for(Constructor c : constructors){
            System.out.println(c);
        }
        //获取公有、无参的构造方法
        System.out.println("+++++++++++++++++获取公有、无参的构造方法++++++++++++++++++");
        Constructor con = cla.getConstructor(null);
        //1.因为是无参的构造方法 所以类型是null ，不写也行：需要一个参数类型；
        //2.返回的是描述这个无参构造函数的类对象

        System.out.println("con="+con);


        System.out.println("******************获取私有构造方法，并调用*******************************");
        con = cla.getDeclaredConstructor(int.class);
        System.out.println(con);

        con.setAccessible(true);
        Object obj = con.newInstance(11);
        System.out.println(obj);
    }

}
