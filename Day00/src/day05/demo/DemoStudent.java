package day05.demo;

public class DemoStudent {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("迪丽热巴");
        stu1.setAge(20);
        System.out.println("姓名: " + stu1.getName() + " 年龄： " + stu1.getAge());
        System.out.println("====================");
        Student stu2 = new Student("古丽",23);
        System.out.println("姓名: " + stu2.getName() + " 年龄： " + stu2.getAge());
        stu2.setAge(24);
        System.out.println("姓名: " + stu2.getName() + " 年龄： " + stu2.getAge());
    }
}
