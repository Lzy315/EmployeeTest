package day04.CollectionAndReflect;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        String[] colors = {"♥", "♣", "♦", "♠"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};

        poker.add("大王");
        poker.add("小王");
        for (String number : numbers) {
            for (String color : colors) {
                poker.add(number + color);
            }
        }

//        System.out.println(poker);
//        System.out.println("===================================");
        //        使用指定的随机源对指定列表进行置换。所有置换发生的可能性都是相等的，假定随机源是公平的。
        Collections.shuffle(poker);
//        System.out.println(poker);


        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            if (i >= 51) {
                dipai.add(poker.get(i));
            } else if (i % 3 == 0) {
                player01.add(poker.get(i));
            } else if (i % 3 == 1) {
                player02.add(poker.get(i));
            } else if (i % 3 == 2) {
                player03.add(poker.get(i));
            }
        }

        System.out.println("刘德华的牌" + player01);
        System.out.println("周润发的牌" + player02);
        System.out.println("周星驰的牌" + player03);
        System.out.println("底牌" + dipai);


    }
}

