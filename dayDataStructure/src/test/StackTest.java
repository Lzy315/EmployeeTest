package test;

import day04Linear.Stack;

public class StackTest {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");

        for (String st:stack){
            System.out.println(st);
        }
        System.out.println("---------------------");
        String result = stack.pop();
        System.out.println("弹出的元素是："+ result);

















/*        //创建栈对象
        Stack<String> stack = new Stack<>();

        //测试压栈
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");

        for (String item : stack) {
            System.out.println(item);
        }
        System.out.println("------------------------------");
        //测试弹栈
        String result = stack.pop();
        System.out.println("弹出的元素是："+result);
        System.out.println("剩余的元素个数："+stack.size());*/

    }
}
