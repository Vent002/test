package com.field;

import java.lang.reflect.Field;

/**?
 *
 * 获取成员变量并调用；
 *
 * 1.批量获取
 *          1）.field[] getFields();获取所有的公有字段；
 *          2）.field[] getDeclaredFields();获取所有字段，包括：私有，受保护的，公有，默认；
 * 2.单个获取
 *          1）.public field getField(String fieldName);获取某个公有字段；
 *          2）.public field getDeclaredField(String fieldName);获取某个字段;
 *
 *
 *      设置字段的值:
 *              field -->public void set(Object obj,Object value);
 *                      obj：设置字段所在的对象；
 *                      value：为字段设置的值；
 *
 *
 */
public class Fields {
    public static void main(String[] args) throws Exception{
        //1.获取Class对象
        Class stuClass = Class.forName("com.field.Student");
        //2.获取字段
        System.out.println("************获取所有公有的字段************");
        Field[] fieldArray = stuClass.getFields();
        for(Field f : fieldArray){
            System.out.println(f);
        }
        System.out.println("***********获取所有字段**************");
        Field[] fields = stuClass.getDeclaredFields();
        for (Field f : fields){
            System.out.println(f);
        }
        System.out.println("************获取公有字段并调用****************");
        Field f = stuClass.getField("name");
        System.out.println(f);
        //获取一个对象
        Object obj = stuClass.getConstructor().newInstance();//产生Stu对象
        // 为字段赋值
        f.set(obj,"张三");//为Stu对象中的name属性赋值;第一个参数：要传入设置的对象，第二个参数：要传入实参
        //验证
        Student student = (Student)obj;
        System.out.println(student.name);

        System.out.println("*************获取私有字段并调用***************");

        f = stuClass.getDeclaredField("phone_num");
        System.out.println(f);
        //obj = stuClass.getDeclaredConstructor().newInstance();
        f.setAccessible(true);

        f.set(obj,"1236712836");
        System.out.println(student);


    }
}
