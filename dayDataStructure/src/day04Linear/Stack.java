package day04Linear;

import java.util.Iterator;


/*
  Stack:插入元素时：
* | head    |
* |_________|
* | newNode |
* |_________|
* | oldFirst|
* |_________|
2022.03.01
* */

public class Stack<T> implements Iterable<T> {

    private Node head;
    private int N;

    public Stack() {
        this.head = new Node(null, null);
        N = 0;
    }

    //判断当前栈中元素个数是否为0
    public boolean isEmpty() {
        return N == 0;
    }

    //获取栈中元素的个数
    public int size() {
        return N;
    }

    //把t元素压入栈
    public void push(T t) {
        //找到首结点指向的第一个结点
        Node oldFirst = head.next;

        //创建新结点
        Node newNode = new Node(t, oldFirst);
        //让首结点指向新结点
        head.next = newNode;
   /*     //让新结点指向原来的第一个结点
       newNode.next = oldFirst;*/
        //元素个数+1；
        N++;
    }

    //弹出栈顶元素
    public T pop() {
        //找到首结点指向的第一个结点
        Node oldFirst = head.next;
        if (oldFirst == null) {
            return null;
        }

        //让首结点指向原来第一个结点的下一个结点
        head.next = oldFirst.next;
        //元素个数-1；
        N--;
        return oldFirst.item;
    }




/*    //判断当前栈中元素个数是否为0
    public boolean isEmpty(){
        return N==0;
    }

    //获取栈中元素的个数
    public int size(){
        return N;
    }

    //把t元素压入栈
    public void push(T t){
        //找到首结点指向的第一个结点
        Node oldFirst = head.next;
        //创建新结点
        Node newNode = new Node(t, null);
        //让首结点指向新结点
        head.next = newNode;
        //让新结点指向原来的第一个结点
        newNode.next=oldFirst;
        //元素个数+1；
        N++;
    }

    //弹出栈顶元素
    public T pop(){
        //找到首结点指向的第一个结点
        Node oldFirst = head.next;
        if (oldFirst==null){
            return null;
        }
        //让首结点指向原来第一个结点的下一个结点
        head.next=oldFirst.next;
        //元素个数-1；
        N--;
        return oldFirst.item;
    }*/


    private class Node {
        public T item;
        public Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public Iterator iterator() {
        return new SIterator();

    }

    private class SIterator implements Iterator<T> {

        Node n = head;

        @Override
        public boolean hasNext() {
            return n.next != null;
        }

        @Override
        public T next() {
            Node node = n.next;
            n = n.next;
            return node.item;
        }
    }

}
