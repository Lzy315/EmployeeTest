package day08.demo;

import day05.demo.Student;

import java.util.ArrayList;

public class DemoArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> listStu = new ArrayList<>();

        Student one = new Student("one", 22);
        Student two = new Student("two", 22);
        Student three = new Student("three", 22);

        listStu.add(one);
        listStu.add(two);
        listStu.add(three);

//        Student student = listStu.get(0);
        for (int i = 0; i < listStu.size(); i++) {
            Student stu = listStu.get(i);
            System.out.println("姓名： " + stu.getName() + ", 年龄： " + stu.getAge());

        }
//        System.out.println("集合中第一个学生对象的名字是： " + listStu.get(0).getName());

    }
}
