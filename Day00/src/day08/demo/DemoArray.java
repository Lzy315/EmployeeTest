package day08.demo;

public class DemoArray {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        Person one = new Person("one", 22);
        Person two = new Person("two", 23);
        Person three = new Person("three", 24);
        array[0] = one;
        array[1] = two;
        array[2] = three;
        System.out.println("一号对象的年龄是：" + one.getAge());
        System.out.println("一号对象的年龄是：" + array[0].getAge());
    }
}
