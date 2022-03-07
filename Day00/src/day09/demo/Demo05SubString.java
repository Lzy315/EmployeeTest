package day09.demo;
//字符串的截取方法
public class Demo05SubString {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("=======================");

        String str3 = str1.substring(4,7); //左闭右开
        System.out.println(str3);
        System.out.println("=======================");

    }
}
