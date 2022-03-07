package day05.demo;

public class HelloJAVA {


    /*    public static void main(String[] args) {
            printMethod();
        }*/
/*    public static void main(String[] args) {
        printMethod();
    }*/
    public static void main(String[] args) {
/*        System.out.println(sum(12,13));
        System.out.println(sum(12,13,14));
        System.out.println(sum(12,13,14,15));*/
//        printMethod();
/*        System.out.println(isSame(20, 20));
        System.out.println("1-100的总和是" + getSum());*/
//        printCount(5);
        byte a = 19;
        byte b = 20;
        System.out.println(issSame(a, b));
        System.out.println(issSame((short) 20, (short) 20));
        System.out.println(issSame(18L,19L));

    }

/*
    public static boolean isSame(int a, int b) {
        return a == b;
    }

    public static void printCount(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("Hello World!");
        }
    }
*/

/*    public static int getSum() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }*/
/*   public static int  sum(int a, int b) {
        System.out.println("两个参数的方法执行");
        return a + b;
    }

    public static int  sum(int a, int b, int c) {
        System.out.println("3个参数的方法执行");
        return a + b + c;
    }

    public static int  sum(int a, int b, int c, int d) {
        System.out.println("4个参数的方法执行");
        return a + b + c + d;
    }*/
/*    public static void printMethod() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }*/
    public static boolean issSame(byte a, byte b) {
        boolean same;
        System.out.println("执行两个byte类型的参数的方法");
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }

    public static boolean issSame(short a, short b) {

        System.out.println("执行两个short类型的参数的方法");
        return a == b;
    }

    public static boolean issSame(long a, long b) {
        System.out.println("执行两个long类型的参数的方法");
        boolean same = a == b ? true : false;
        return same;
    }

}
