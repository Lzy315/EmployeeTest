package day09.demo;

import java.awt.desktop.QuitStrategy;
//day08_04 字符串的比较相关方法
public class Demo03StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("Hello"));

        String str4 = "hello";
        System.out.println(str1.equals(str4)); //false
        System.out.println("Hello".equals(str3));

        String str5 = null;
        System.out.println("Hello".equals(str5)); //推荐写法
//        System.out.println(str5.equals("Hello")); //不推荐写法，报错空指针异常NullPointerException
        System.out.println("=============================");

        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB)); //false 区分大小写
        System.out.println(strA.equalsIgnoreCase(strB)); //true 忽略大小写
    }
}
