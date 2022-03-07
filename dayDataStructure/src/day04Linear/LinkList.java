package day04Linear;

import java.awt.desktop.AppReopenedEvent;
import java.util.Iterator;

public class LinkList<T> implements Iterable<T> {

    private Node head;
    private int N;

    public LinkList() {
        head = new Node(null, null);
        N = 0;
    }

    public void clear() {
        head.next = null;
    }

    public int length() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }



    public T get(int i) {
        if (i < 0 || i >= N) {
            throw new RuntimeException("位置不合法！");
        } else {
            Node n = head.next;
            for (int j = 0; j < i; j++) {
                n = n.next;
            }
            return n.item;
        }
    }

    public void insert(T t) {

        Node n = head;
        Node newNode = new Node(t, null);
/*       for (int i = 0; i < N; i++) {
           n = n.next;
       }*/
        while (n.next != null) {
            n = n.next;
        }
        n.next = newNode;

        N++;
    }

    public void insert(int i, T t) {
        if (i < 0 || i >= N) {
            throw new RuntimeException("位置不合法！");
        }

        Node pre = head;
        for (int j = 0; j <= i-1; j++) {
            pre = pre.next;
        }

        Node curr = pre.next;
/*        Node newNode = new Node(t, null);
        curr.next = newNode;*/
//构建新的结点，让新结点指向位置i的结点
        Node newNode = new Node(t, curr);
//让之前的结点指向新结点
        pre.next = newNode;
//长度+1

        N++;
    }

    public T  remove(int i){
        if (i<0 || i>=N){
            throw new RuntimeException("位置不合法");
        }

        Node pre = head;
        for (int j = 0; j <=i-1; j++) {
            pre = pre.next;
        }
        Node curr = pre.next;
        Node nextNode = curr.next;
        pre.next = nextNode;
        N--;
        return curr.item;
    }



    public int indexOf(T t){
        Node n = head;
        for (int i = 0; n.next != null; i++) {
            n = n.next;
            if (n.item.equals(t)){
                return i;
            }
        }
        return -1;
    }


    public void reverse(){
        //判断当前链表是否为空链表，如果是空链表，则结束运行，如果不是，则调用重载的reverse方法完成反转
        if(N==0){
            return;
        }
        else reverse(head.next);
    }

    public Node reverse(Node curr){
        if (curr.next == null){
            head.next  = curr;
            return curr;
        }
        //递归的反转当前结点curr的下一个结点；返回值就是链表反转后，当前结点的上一个结点
        Node pre = reverse(curr.next);
        pre.next = curr;
        curr.next = null;
        return curr;
    }


    @Override
    public Iterator<T> iterator() {
        return new LIterator();
    }

    public class LIterator implements Iterator{
        Node n ;
        public LIterator(){
            this.n = head;
        }

        @Override
        public boolean hasNext() {
            return n.next != null;
        }

        @Override
        public Object next() {
            n = n.next;
            return n.item;
        }
    }


    private class Node {
        T item;
        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }

    }




/*    //用来反转整个链表
    public void reverse(){

        //判断当前链表是否为空链表，如果是空链表，则结束运行，如果不是，则调用重载的reverse方法完成反转
        if (isEmpty()){
            return;
        }

        reverse(head.next);
    }

    //反转指定的结点curr，并把反转后的结点返回
    public Node reverse(Node curr){
        if (curr.next==null){
            head.next=curr;
            return curr;
        }
        //递归的反转当前结点curr的下一个结点；返回值就是链表反转后，当前结点的上一个结点
        Node pre = reverse(curr.next);
        //让返回的结点的下一个结点变为当前结点curr；
        pre.next=curr;
        //把当前结点的下一个结点变为null
        curr.next=null;
        return curr;
    }*/



}
