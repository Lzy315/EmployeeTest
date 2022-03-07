package day09.demo;

public class Demo06StringConvert {
    public static void main(String[] args) {
        //将当前字符串拆分成字符数组作为返回值
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("=======================");

        //获得当前字符串底层的字节数组

        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length ; i++) {
            System.out.println(bytes[i]);

        }
        System.out.println("=======================");

        //将索引出现的老字符串替换成新的字符串，返回替换之后的结果新字符串。
        String str1 = "How do you do";
        String str2 = str1.replace("o","*");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("=======================");

        String str3 = "会不会玩儿呀，你大爷的！";
        String str4 = str3.replace("大爷的","***");
        System.out.println(str3);
        System.out.println(str4);
        System.out.println("=======================");


    }
}
