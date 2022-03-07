package day10;
/*
如果一个成员变量用了static关键字，n那么这个变量不再属于对象自己，而是属于所在的类，多个对象共享同一个数据。
 * */

public class Demo01StaticFeild {
    public static void main(String[] args) {
        Student stu1 = new Student("张三", 12);
        stu1.room = "101教室";
        System.out.println("姓名： " + stu1.getName() + " 年龄: " + stu1.getAge() + " 教室: " + stu1.room + ", 学号： " + stu1.getId());

        System.out.println("================================================");

        Student stu2 = new Student("李四", 15);
//        stu2.room = "102教室";
        System.out.println("姓名：" + stu2.getName() + " 年龄： " + stu2.getAge() + " 教室： " + stu2.room + ", 学号： " + stu2.getId());


    }

}
