package day07.demo;

import java.util.Scanner;

public class Day07ScannerMax {
    public int getMax(int[] array) {
        int max = array[0];
/*        if (array[1] > max) {
            max = array[1];
        }
        if (array[2] > max) {
            max = array[2];
        }*/
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*        Day07ScannerMax day07ScannerMax = new Day07ScannerMax();
        int[] num = new int[3];
        int max;
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第 " + i +"个数据");
             num[i] = scanner.nextInt() ;
        }
        System.out.println("输入的三个数据中最大值是： " + day07ScannerMax.getMax(num) );*/
        System.out.println("输入第一个数据：");
        int a = scanner.nextInt();
        System.out.println("输入第二个数据：");
        int b = scanner.nextInt();
        System.out.println("输入第三个数据：");
        int c = scanner.nextInt();
        int tep = a > b ? a:b;
        int max = tep > c ? tep:c;
        System.out.println("输入的三个数据中最大值是： " + max );

    }
}
