package day08.demo;
import java.util.ArrayList;
public class DemoArrayList {
    public static void main(String[] args) {
//        ArrayList<String> arrayList = new ArrayList<>();
//        System.out.println(arrayList);
//        arrayList.add("Li");
//        arrayList.add("Lei");
//        System.out.println(arrayList);

        ArrayList<String> arrayList = new ArrayList<>();
        boolean success = arrayList.add("li");
        System.out.println("添加是否成功：" + success);
        arrayList.add("Wang");
        arrayList.add("Liu");
        String name = arrayList.get(2);
        System.out.println("获取集合第三个元素：" + name);
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println("删除集合第三个元素后：");
        System.out.println(arrayList);
        int size = arrayList.size();
        System.out.println("集合长度为：" + size);

    }
}
