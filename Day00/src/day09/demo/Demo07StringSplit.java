package day09.demo;

//字符串的分割方法
public class Demo07StringSplit {
    public static void main(String[] args) {
        int n = 16;
        String str1 = "aaa,bbb,ccc";
        String[] array = str1.split(",");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("======================");

        String str2 = "aaa bbb ccc";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("======================");

        String str3 = "XXX.YYY.ZZZ";
        String[] array3 = str3.split("\\.");  //split()方法的参数是一个正则表达式，如果按照"."进行切分，必须写成"\\."
        for (int i = 0; i < array.length; i++) {
            System.out.println(array3[i]);
        }
        System.out.println("======================");

    }
}
