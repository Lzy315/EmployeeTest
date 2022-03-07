package day04Linear;
/*双向链表2022.02.28*/
import java.util.Iterator;

public class TowWayLinkList<T> implements Iterable<T> {





    private Node head;
    private Node last;
    private  int N;

    public  TowWayLinkList(){
        this.head = new Node(null,null,null);
        this.last = null;
        this.N  = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new TIterator();
    }


    public class  TIterator implements Iterator{
        Node n;
        public TIterator(){
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


    public class Node{
        private T item;
        private Node pre;
        private Node next;

        public Node(T item, Node pre, Node next){
            this.item = item;
            this.pre = pre;
            this.next = next;
        }
    }


    //清空链表
    public void clear(){
        head.item = null;
        head.pre = null;
        head.next = null;
        N = 0;
    }

    //获取链表长度
    public int length(){
        return N;

    }


    //判断链表是否为空
    public boolean isEmpty(){
        return N == 0;

    }

    //获取第一个元素
    public T getFirst(){
        if (N == 0){
            return null;
        }else {
            return head.next.item;
        }
    }

    //获取最后一个元素
    public T getLast(){
        if (isEmpty()){
            return null;
        }
        return last.item;
    }

    //插入元素t
    public void insert(T t){

        if (isEmpty()){
            //如果链表为空：

            //创建新的结点
            Node newNode = new Node(t, head, null);

            //让新结点成为为尾结点
            last = newNode;

            //让头结点指向尾结点
            head.next = last;

        }else {
            //如果链表不为空

            //创建新的结点
//            Node newNode = new Node(t, last, null);
//
//            //让当前的尾结点指向新结点
//            last.next = newNode;
//            //让新结点称为尾结点
//            last = newNode;


            //如果链表不为空
            Node oldLast = last;

            //创建新的结点
            Node newNode = new Node(t, oldLast, null);

            //让当前的尾结点指向新结点
            oldLast.next=newNode;
            //让新结点称为尾结点
            last = newNode;
        }

        //元素个数+1
        N++;

    }


    //向指定位置i处插入元素t
    public void insert(int i,T t){
        //找到i位置的前一个结点
        Node pre = head;
        //找到i位置的结点
        for (int index = 0; index < i; index++) {
            pre = pre.next;
        }

        //找到i位置的结点
        Node curr = pre.next;
        //创建新结点
        Node newNode = new Node(t, pre, curr);

        //让i位置的前一个结点的下一个结点变为新结点
        pre.next = newNode;
        //让i位置的前一个结点变为新结点
        curr.pre = newNode;

        //元素个数+1
        N++;
    }

    //获取指定位置i处的元素
    public T get(int i){
        //找到i位置的前一个结点
        Node pre = head;
        //找到i位置的结点
        for (int index = 0; index <=i; index++) {
            pre = pre.next;
        }
        return pre.item;
    }

    //找到元素t在链表中第一次出现的位置
    public int indexOf(T t){
        Node n = head;
        for (int i = 0; n.next != null; i++) {
            n = n.next;
            if (n.item.equals(t)){
//            if (n.next.equals(t)){ //此处源代码有误
                return i;
            }
        }
        return -1;
    }

    //删除位置i处的元素，并返回该元素
    public T remove(int i){
        //找到i位置的前一个结点
        Node pre = head;
        for(int index=0;index<i;index++){
            pre=pre.next;
        }
        //找到i位置的结点
        Node curr = pre.next;
        //找到i位置的下一个结点
        Node nextNode = curr.next;
        //让i位置的前一个结点的下一个结点变为i位置的下一个结点
       pre.next = nextNode;
        //让i位置的下一个结点的上一个结点变为i位置的前一个结点
     nextNode.pre = pre;
        //元素的个数-1
        N--;
        return curr.item;

    }

    @Override
    public String toString() {
        return "TowWayLinkList{" +
                "head=" + head +
                ", last=" + last +
                ", N=" + N +
                '}';
    }


    /*
    //首结点
    private Node head;
    //最后一个结点
    private Node last;

    //链表的长度
    private int N;



    //结点类
    private class Node{
        public Node(T item, Node pre, Node next) {
            this.item = item;
            this.pre = pre;
            this.next = next;
        }

        //存储数据
        public T item;
        //指向上一个结点
        public Node pre;
        //指向下一个结点
        public Node next;
    }

    public TowWayLinkList() {
        //初始化头结点和尾结点
        this.head = new Node(null,null,null);
        this.last=null;
        //初始化元素个数
        this.N=0;
    }

    //清空链表
    public void clear(){
        this.head.next=null;
        this.head.pre=null;
        this.head.item=null;
        this.last=null;
        this.N=0;
    }

    //获取链表长度
    public int length(){
        return N;
    }

    //判断链表是否为空
    public boolean isEmpty(){
        return N==0;
    }

    //获取第一个元素
    public T getFirst(){
        if (isEmpty()){
            return null;
        }
        return head.next.item;
    }

    //获取最后一个元素
    public T getLast(){
        if (isEmpty()){
            return null;
        }
        return last.item;
    }

    //插入元素t
    public void insert(T t){

        if (isEmpty()){
            //如果链表为空：

            //创建新的结点
            Node newNode = new Node(t,head, null);
            //让新结点称为尾结点
            last=newNode;
            //让头结点指向尾结点
            head.next=last;
        }else {
            //如果链表不为空
            Node oldLast = last;

            //创建新的结点
            Node newNode = new Node(t, oldLast, null);

            //让当前的尾结点指向新结点
            oldLast.next=newNode;
            //让新结点称为尾结点
            last = newNode;
        }

        //元素个数+1
        N++;

    }

    //向指定位置i处插入元素t
    public void insert(int i,T t){
        //找到i位置的前一个结点
        Node pre = head;
        for(int index=0;index<i;index++){
            pre=pre.next;
        }
        //找到i位置的结点
        Node curr = pre.next;
        //创建新结点
        Node newNode = new Node(t, pre, curr);
        //让i位置的前一个结点的下一个结点变为新结点
        pre.next=newNode;
        //让i位置的前一个结点变为新结点
        curr.pre=newNode;
        //元素个数+1
        N++;
    }

    //获取指定位置i处的元素
    public T get(int i){
        Node n = head.next;
        for(int index=0;index<i;index++){
            n=n.next;
        }
        return n.item;
    }

    //找到元素t在链表中第一次出现的位置
    public int indexOf(T t){
        Node n = head;
        for(int i=0;n.next!=null;i++){
            n=n.next;
            if (n.next.equals(t)){
                return i;
            }
        }
        return -1;
    }

    //删除位置i处的元素，并返回该元素
    public T remove(int i){
        //找到i位置的前一个结点
        Node pre = head;
        for(int index=0;index<i;index++){
            pre=pre.next;
        }
        //找到i位置的结点
        Node curr = pre.next;
        //找到i位置的下一个结点
        Node nextNode= curr.next;
        //让i位置的前一个结点的下一个结点变为i位置的下一个结点
        pre.next=nextNode;
        //让i位置的下一个结点的上一个结点变为i位置的前一个结点
        nextNode.pre=pre;
        //元素的个数-1
        N--;
        return curr.item;
    }

    @Override
    public Iterator<T> iterator() {
        return new TIterator();
    }

    private class TIterator implements Iterator{
        private Node n;
        public TIterator(){
            this.n=head;
        }
        @Override
        public boolean hasNext() {
            return n.next!=null;
        }

        @Override
        public Object next() {
            n=n.next;
            return n.item;
        }
    }*/






}
