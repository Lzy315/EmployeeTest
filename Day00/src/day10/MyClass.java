package day10;

public class MyClass {

    int num;
    static String str;
    public void method() {
        System.out.println("这是一个成员方法。");

        System.out.println(num);
        System.out.println(str);

    }

    public static void methodStatic() {
        System.out.println("这是一个静态方法");

//        System.out.println(num); //静态不能访问非静态，内存中先有静态，再有非静态
//        System.out.println(this);  //静态方法中不能使用this关键字，this代表当前对象，静态与当前对象无关。
    }
}
