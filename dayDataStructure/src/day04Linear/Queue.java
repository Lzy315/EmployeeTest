package day04Linear;

import java.util.Iterator;
/*队列2022.03.02
*   Queue:插入元素时：
 * |last(new)|
 * |_________|
 * | oldLast |
 * |_________|
 * | head    |
 * |_________|
* */
public class Queue<T> implements Iterable<T>{

    Node head;
    Node last;
    int N;

    public Queue() {
        this.head = new Node(null, null);
        this.last = null;
        N = 0;
    }

    //判断队列是否为空
    public boolean isEmpty(){
        return N==0;
    }

    //返回队列中元素的个数
    public int size(){
        return N;
    }


    //向队列中插入元素t
    public void enqueue(T t){

        if (last==null){
            //当前尾结点last为null
            last = new Node(t,null);
            head.next = last;

        }else {
            //当前尾结点last不为null
            Node oldLast = last;
            last = new Node(t,null);
            oldLast.next = last;
        }

        //元素个数+1
        N++;
    }

    //从队列中拿出一个元素
    public T dequeue(){
        if (isEmpty()){
            return null;
        }
        Node node = head.next;
        head.next = node.next;
        N--;
        //因为出队列其实是在删除元素，因此如果队列中的元素被删除完了，需要重置last=null;
        if (isEmpty()){
            last=null;
        }
        return node.item;

    }





    @Override
    public Iterator<T> iterator() {
        return new QIterator();
    }

    private class QIterator implements Iterator<T> {
        Node node = head;

        @Override
        public boolean hasNext() {
            return node.next != null;
        }

        @Override
        public T next() {
            Node n = node.next;
            node = node.next;
            return n.item;
        }

    }


    public class Node{
        T item;
        Node next;
        public Node(T t, Node next){
            this.item = t;
            this.next = next;
        }
    }

}
