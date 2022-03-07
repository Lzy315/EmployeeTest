package day09.demo;
//08_05 字符串的获取相关方法
public class Demo04StringGet {
    public static void main(String[] args) {
        int length = "dfhvnedvkldmv".length(); //获取字符串长度
        System.out.println(length);
        System.out.println("======================");

        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2); //拼接字符串
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("======================");

        char ch = "Hello".charAt(1); //获取指定索引位置的单个字符
        System.out.println("在1号索引位置的字符是： " + ch);
        System.out.println("======================");

        String original = "HelloWorld";
        int index = original.indexOf("llo"); //查找参数字符串在本来字符串当中出现的第一次索引位置，如果没有，则返回-1
        System.out.println("第一次的索引位置是： " +index);
        int index2 = original.indexOf("1o");
        System.out.println("第一次的索引位置是： " +index2);
        System.out.println("======================");


    }
}
