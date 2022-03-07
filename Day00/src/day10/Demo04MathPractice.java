package day10;
/*
请使用Math 相关的API，计算在 -10.8 到5.9 之间，绝对值大于6 或者小于2.1 的整数有多少个？
* */
public class Demo04MathPractice {
    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.9;
        int count = 0;

        System.out.println(Math.ceil(min));

        for (double i = min; i <= max; i++) {
            if(Math.abs(i) > 6 || Math.abs(i) < 2.1) {
                count++;
            }

        }
        System.out.println("整数有： " + count + " 个");

    }
}
