package day08.demo;

import java.util.ArrayList;
import java.util.Random;

public class DemoArrayListReturn {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> listA = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listA.add(random.nextInt(30) + 1);
        }
        ArrayList<Integer> listB = listSelect(listA);
        System.out.println(listA);
        System.out.println(listB);
    }

    public static  ArrayList<Integer> listSelect(  ArrayList<Integer> listA) {

        ArrayList<Integer> listB = new ArrayList<>();
        for (int i = 0; i < listA.size(); i++) {
            if (listA.get(i) % 2 == 0) {
                listB.add(listA.get(i));
            }
        }
        return listB;
    }
}
