package day07.demo;
import java.util.Scanner;


public class Day07ScannerSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数据1：");
        int num1 = scanner.nextInt();
        System.out.println("请输入数据2：1");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("输入的两个数据的和是： " + sum);
    }
}
