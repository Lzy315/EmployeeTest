package day04.CollectionAndReflect;

import java.util.*;

//有序版本
public class DouDiZhu2 {
    public static void main(String[] args) {
//        准备牌
        HashMap<Integer, String> poker = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        List<String> colors = List.of("♥", "♣", "♦", "♠");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        int index = 0;
        poker.put(index, "大王");
        pokerIndex.add(index);
        index++;
        poker.put(index, "小王");
        pokerIndex.add(index);
        index++;
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index,number + color);
                pokerIndex.add(index);
                index++;
            }
        }
//洗牌
        Collections.shuffle(pokerIndex);
        System.out.println(pokerIndex);
//        发牌


        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();

        for (int i = 0; i < pokerIndex.size(); i++) {
            if (i >= 51) {
                dipai.add(pokerIndex.get(i));
            } else if (i % 3 == 0) {
                player01.add(pokerIndex.get(i));
            } else if (i % 3 == 1) {
                player02.add(pokerIndex.get(i));
            } else if (i % 3 == 2) {
                player03.add(pokerIndex.get(i));
            }
        }
//        4.排序,升序
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(dipai);
//降序排列
//        Collections.sort(player01,Comparator.reverseOrder());

//        5.看牌

        lookPoker("刘德华", player01, poker);
        lookPoker("周润发", player02, poker);
        lookPoker("周星驰", player03, poker);
        lookPoker("底牌", dipai, poker);
//ctrl+alt+v 自动补全左侧声明变量代码
//        Integer integer = player01.get(55);

    }
    public static void lookPoker(String name, ArrayList<Integer> playerList, HashMap<Integer, String> poker) {
        System.out.println(name + "的牌: ");
        for (Integer key : playerList) {
            String pokers = poker.get(key);
            System.out.println(pokers + " ");
        }
//        System.out.println(" ");
    }



}
