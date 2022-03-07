package day10;
/*
* 一旦使用static修饰成员方法，那么这个方法就变成了静态方法，静态方法不属于对象，而是属于类。
*
* */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.method();

        myClass.methodStatic(); //正确，不推荐

        MyClass.methodStatic();  //正确，推荐。

        myMethod(); //省略类名


    }

    public static void myMethod() {
        System.out.println("自己的方法");
    }
}
