package day08.demo;
import java.util.Random;
import java.util.Scanner;

public class Demo08Random {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
//        int num = random.nextInt();
//        System.out.println("随机数是： " + num);
//        for (int i = 0; i < 20; i++) {
//            int num = random.nextInt(10) + 1;
//            System.out.println("随机数是：" + num);
//        }
        int randomNum = random.nextInt(100) + 1;
    while (true) {
        System.out.println("请输入你猜测的数字，范围1-100");
        int guessNum = scanner.nextInt();
        if (guessNum > randomNum) {
            System.out.println("太大了，请重试");
        }else if (guessNum < randomNum) {
            System.out.println("太小了，请重试");
        } else {
            System.out.println("猜对了");
            break;
        }
    }
    System.out.println("游戏结束！");
    }
}
