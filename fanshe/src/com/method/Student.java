package com.method;

public class Student {
        public void show1(String name){
                System.out.println("调用了公有的方法：show1() String name="+name);
        }
        private String show2(int age){
                System.out.println("调用了 私有的 有返回值 方法：show2() int:age =  "+age);
                return "gxming ";
        }
        protected void show3(){
                System.out.println("调用了 受保护 无参数的 show3()");
        }
        void show4(){
                System.out.println("调用了 默认的 无参的 show4()");
        }

}
