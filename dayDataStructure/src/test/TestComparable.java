package test;

import day03sort.Student;

//2.定义测试类Test，在测试类Test中定义测试方法Comparable getMax(Comparable c1,Comparable c2)完成测试
public class TestComparable {
   public static Comparable getMax(Comparable c1,Comparable c2)
    {
        int res = c1.compareTo(c2);  //c1-c2
        if (res >= 0) return c1;
        else return c2;
    }

    public static void main(String[] args) {
        Student s1 = new Student("张三",20);
        Student  s2 = new Student("李四",24);
        Comparable max = getMax(s1, s2);
        System.out.println(max);
    }

}
