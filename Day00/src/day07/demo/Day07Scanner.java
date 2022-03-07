package day07.demo;
import java.util.Scanner;

//获取键盘输入的一个int数字

public class Day07Scanner {
    public static void main(String[] args) {
        Scanner scanner = methodReturnScanner();
//        methodScanner(new Scanner(System.in));
//        int num = scanner.nextInt();
//        System.out.println("输入的数字是: " + num);
//        String string = scanner.next();
//        System.out.println("输入的字符串是：" + string);
        int num = scanner.nextInt();
        System.out.println("输入的数据是： " + num);
    }

    public static void methodScanner(Scanner scanner) {
        int num = scanner.nextInt();
        System.out.println("输入的数据是： " + num);
    }

    public static Scanner methodReturnScanner() {
        return new Scanner(System.in);
    }
}
