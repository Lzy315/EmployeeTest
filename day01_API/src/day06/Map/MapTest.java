package day06.Map;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = scanner.next();

        HashMap<Character, Integer> map = new HashMap<>();
//        char[] array = str.toCharArray();
//        for (int i = 0; i < array.length; i++) {
//            char c = array[i];
//        }
//        使用增强for,str.toCharArray().for
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                Integer value = map.get(c);
                value++;
                map.put(c, value);
            } else {
                map.put(c, 1);
            }
        }
//        set集合遍历hashmap

        Set<Character> set = map.keySet();
//        for (Character c : set) {
//            System.out.println(c + "=" + map.get(c));
//        }


        Iterator<Character> it = set.iterator();
        while (it.hasNext()) {
            Character c = it.next();
            System.out.println(c + "=" + map.get(c));

        }


//        Entry键值对遍历hashmap
//        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
//        for (Map.Entry<Character, Integer> integerEntry : entrySet) {
//            System.out.println( integerEntry.getKey()+ "=" + integerEntry.getValue());
//        }

//        Iterator<Map.Entry<Character, Integer>> it = entrySet.iterator();
//        while (it.hasNext()) {
//            Map.Entry<Character, Integer> entry = it.next();
//            System.out.println( entry.getKey() + "=" + entry.getValue());
//        }


    }
}
