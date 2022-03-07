package test;

import day04Linear.TowWayLinkList;
/*双向链表2022.03.01*/
public class TowWayLinkListTest {
    public static void main(String[] args) {
        //创建双向链表对象
        TowWayLinkList<String> sl = new TowWayLinkList<>();
        //测试插入
        sl.insert("姚明");
        sl.insert("科比");
        sl.insert("麦迪");
        sl.insert(2,"詹姆斯");

//        System.out.println(sl.toString());

        for (String s : sl) {
            System.out.println(s);
        }

//        TowWayLinkList<String> sl = new TowWayLinkList<>();
        System.out.println("--------------------------------------");
        System.out.println("第一个元素是："+sl.getFirst());
        System.out.println("最后一个元素是："+sl.getLast());

        System.out.println("------------------------------------------");
        System.out.println("姚明的索引为：" +   sl.indexOf("姚明"));
        //测试获取
        String getResult = sl.get(2);
        System.out.println("获取索引2处的结果为："+getResult);
        //测试删除
        String removeResult = sl.remove(0);
        System.out.println("删除的元素是："+removeResult);
        //测试清空
        sl.clear();
        System.out.println("清空后的线性表中的元素个数为:"+sl.length());
    }
}
