package day08.demo;

import java.util.ArrayList;

public class DemoArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        boolean success = list.add("Li");
        System.out.println(success);
        list.add("Wang");
        list.add("Liu");
        System.out.println(list);
        arrayListPrint(list); //传递的是集合参数的地址值
    }

    public static void arrayListPrint(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.println(list.get(i) + "}");
            } else {
                System.out.print(list.get(i) + "@");
            }
        }
    }
}
