package day08.demo;

import java.util.ArrayList;
import java.util.Random;

public class DemoArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            list.add(random.nextInt(32) + 1);
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("集合中的第 " +(i+1) + "个数据 " + list.get(i));
        }
    }
}
