package test;

import day04Linear.SequenceList;
/*顺序表测试*/
public class SequenceListTest {
    public static void main(String[] args) {
/*        //创建顺序表对象
        SequenceList<String> sl = new SequenceList<>(10);
        //测试插入
        sl.insert("姚明");
        sl.insert("科比");
        sl.insert("麦迪");
//        sl.insert(1,"詹姆斯");

        for (int i = 0; i < sl.length(); i++) {
            System.out.println(sl.get(i));
        }
        sl.insert(1,"詹姆斯");
        System.out.println("------------------------------------------");

        for (int i = 0; i < sl.length(); i++) {
            System.out.println(sl.get(i));
        }
        System.out.println("---------------------------------------------");
        System.out.println("增强for：");
        for (String s : sl) {
            System.out.println(s);
        }


        System.out.println("------------------------------------------");

        //测试获取
        String getResult = sl.get(1);
        System.out.println("获取索引1处的结果为："+getResult);
        //测试删除
        String removeResult = sl.remove(0);
        System.out.println("删除的元素是："+removeResult);
        //测试清空
        sl.clear();
        System.out.println("清空后的线性表中的元素个数为:"+sl.length());*/

        SequenceList<String> squence = new SequenceList<>(5);
//测试遍历
        squence.insert(0, "姚明");
        squence.insert(1, "科比");
        squence.insert(2, "麦迪");
        squence.insert(3, "艾佛森");
        squence.insert(4, "卡特");
        System.out.println(squence.capacity());
        squence.insert(5,"aa");
        System.out.println(squence.capacity());
        squence.insert(5,"aa");
        squence.insert(5,"aa");
        squence.insert(5,"aa");
        squence.insert(5,"aa");
        squence.insert(5,"aa");
        System.out.println(squence.capacity());
        squence.remove(1);
        squence.remove(1);
        squence.remove(1);
        squence.remove(1);
        squence.remove(1);
        squence.remove(1);
        squence.remove(1);
        System.out.println(squence.capacity());
    }
}
