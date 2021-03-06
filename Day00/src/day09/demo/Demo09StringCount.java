package day09.demo;

import java.util.Scanner;
/**
 * 键盘录入一个字符，统计字符串中大小写字母及数字字符个数
 */
public class Demo09StringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String input = sc.next();

        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if ('A' <= ch &&  ch <= 'Z') {
                countUpper++;
            }else if ('a' <= ch && ch <= 'z') {
                countLower++;
            } else if ('0' <= ch && ch <= '9') {
                countNumber++;
            } else countOther++;
        }
        System.out.println("大写字母有：" + countUpper + " 个");
        System.out.println("小写字母有：" + countLower + " 个");
        System.out.println("数字字符有：" + countNumber + " 个");
        System.out.println("其他字符有：" + countOther + " 个");
    }
}
