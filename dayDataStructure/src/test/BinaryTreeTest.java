package test;

import day04Linear.Queue;
import day06Tree.BinaryTree;

public class BinaryTreeTest {
    public static void main(String[] args) {

        /*二叉树遍历测试 2022.03.05*/
        BinaryTree<String, String> bt = new BinaryTree<>();
        bt.put("E", "5");
        bt.put("B", "2");
        bt.put("G", "7");
        bt.put("A", "1");
        bt.put("D", "4");
        bt.put("F", "6");
        bt.put("H", "8");
        bt.put("C", "3");
        Queue<String> queue1 = bt.preErgodic();
        for (String key : queue1) {
            System.out.println("前序遍历：" + key+"="+bt.get(key));
        }
        System.out.println("-------------------------");

        Queue<String> queue2 = bt.midErgodic();
        for (String key : queue2) {
            System.out.println("中序遍历：" + key+"="+bt.get(key));
        }
        System.out.println("-------------------------");

        Queue<String> queue3 = bt.afterErgodic();
        for (String key : queue3) {
            System.out.println("后序遍历：" + key+"="+bt.get(key));
        }
        System.out.println("-------------------------");

        Queue<String> queue4 = bt.layerErgodic();
        for (String key : queue4) {
            System.out.println("层序遍历：" + key+"="+bt.get(key));
        }
        System.out.println("-------------------------");


        System.out.println("最大深度为： " + bt.maxDepth());

        System.out.println("-------------------------");


       /* *//*二叉树测试2022.03.04*//*
        //创建二叉查找树对象
        BinaryTree<Integer, String> tree = new BinaryTree<>();

        //测试插入
        tree.put(0,"张三");
        tree.put(2,"李四");
        tree.put(3,"王五");
        tree.put(9,"小五");
        System.out.println("插入完毕后元素的个数："+tree.size());

        //测试获取
        System.out.println("键2对应的元素是："+tree.get(2));

        //测试删除

        tree.delete(3);
        System.out.println("删除后的元素个数："+tree.size());
        System.out.println("删除后键3对应的元素:"+tree.get(3));

        System.out.println("最大键值是： " + tree.max());
        System.out.println("最小键值是： " + tree.min());
        */







    }
}
