package day08.demo;

import java.util.ArrayList;

public class DemoArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        boolean success = list.add("Li");
        System.out.println(success);
        list.add("Wang");
        list.add("Liu");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
