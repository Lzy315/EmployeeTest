package day09.demo;

/*
///定义一个方法，把数组{1,2,3}按照指定个格式拼接成一个字符串。格式参照如下：[word1#word2#word3]。
//三要素：
返回值类型: String
方法名称：
参数列表：
 */
public class Demo08StringPractice {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        String str1;
        str1 = fromArraytoString(array);
        System.out.println(str1);

    }

    public static String fromArraytoString(int[] a) {
        String str = "[";
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                str += "word" + a[i] + "]";
            }else str += "word" + a[i] + "#";
}
        return str;

    }
}
