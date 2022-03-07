package day09.demo;


//day09.demo对应课程day08.demo
public class DemoString {
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println("第一个字符串是： " + str1);

        char[] array = new char[] {'A', 'B', 'C'};
        String str2 = new String(array);
        System.out.println("第二个字符串是： " + str2);

        byte[] array2 = new byte[] {97, 98, 99};
        String str3 = new String(array2);
        System.out.println("第三个字符串是： " + str3);

        String str4 = "String"; //直接创建，也是字符串对象。
        System.out.println("第四个字符串是： " + str4);
    }
}
