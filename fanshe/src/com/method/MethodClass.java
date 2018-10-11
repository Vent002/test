package com.method;

import java.lang.reflect.Method;

public class MethodClass  {

    public static void main(String[] args) throws Exception {

        /**
         *
         * 获取成员方法并调用
         *
         *                  1.批量获取
         *                      public Method[] getMethods();获取所有“公有方法”
         *                      public Method[] getDeclaredMethods(); 获取所有“私有方法”；包括受保护的方法、私有的、不包括继承
         *                  2.单个获取
         *                      public Method getMethod(String name;Class<?>...ParameterType);
         *                                          参数说明：
         *                                                  name : 方法名
         *                                                 Class : 形参的Class类型对象
         *                      public Method getDeclaredMethod(String name;Class<?>...ParameterType);
         *
         *                 调用方法：
         *                          Method--> public Object invoke(Object obj,Object...args)
         *                                          参数说明：
         *                                                  obj : 要调用方法的对象
         *                                                  args : 调用方法时传递的实参
         */

        //加载Class对象
        Class cla =Class.forName("com.method.Student");

        System.out.println("***********获取所有公有的成员方法**************");
        //获取所有成员方法
        Method [] methodsarray = cla.getMethods();
        for(Method m : methodsarray ){
            System.out.println(m);
        }
        System.out.println("***********获取所有的成员方法，包括私有方法**************");
        methodsarray = cla.getDeclaredMethods();
        for (Method m : methodsarray){
            System.out.println(m);
        }
        System.out.println("***********获取单个公有成员方法 show1()方法**************");
        //通过getmethod()获取show1()方法
        Method m = cla.getMethod("show1", String.class);//调用制定方法（所有包括私有的），需要传入两个参数，第一个是调用的方法名称，第二个是方法的形参类型
        System.out.println(m);
        //实例化
        Object obj = cla.getConstructor().newInstance();
        m.invoke(obj,"张三");

        System.out.println("************获取单个私有成员方法 show2()方法****************");
        m = cla.getDeclaredMethod("show2", int.class);
        System.out.println(m);
        m.setAccessible(true);
        Object re = m.invoke(obj,21);//一个是要调用的对象（获取有反射），一个是实参
        System.out.println("返回值："+re);

    }
}
