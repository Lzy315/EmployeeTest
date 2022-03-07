package day04Linear;

import javax.swing.plaf.SliderUI;
import java.util.Iterator;
import java.util.Objects;
/*顺序表*/
public class SequenceList<T> implements Iterable<T> {


    private T[] eles;
    private int N;

    public SequenceList(T[] eles, int n) {
        this.eles = eles;
        N = n;
    }

    public SequenceList(int capacity) {

        this.eles = (T[]) new Object[capacity]; //Object,不是下面的Objects
        this.N = 0;

   /*     this.eles = (T[]) new Objects[capacity];
        this.N = 0;*/


    }

/*    //构造方法
    public SequenceList(int capacity){
        //初始化数组
        this.eles=(T[])new Object[capacity];
        //初始化长度
        this.N=0;
    }*/

    public void clear() {
        this.N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int length() {
        return N;
    }

    public T get(int i) {
        if (i < 0 || i >= N) {
            throw new RuntimeException("当前元素不存在！");
        }
        return eles[i];
    }

    public void insert(T t) {
        if (eles.length == N) {
            throw new RuntimeException("当前表已满！");

        }
        //先扩容再添加
        if (N == eles.length) {
            resize(2 * eles.length);
        }

        eles[N++] = t;
    }

    public void insert(int i, T t) {
//        if (eles.length == N) {
//            throw new RuntimeException("当前表已满！");
//
//        }
//        if (i < 0 || i > N) {
//            throw new RuntimeException("插入位置不合法！");
//        }
//先扩容再添加
        if (N == eles.length) {
            resize(2 * eles.length);
        }

        for (int index = N; index > i; index--) {
            eles[index] = eles[index - 1];
        }
        eles[i] = t;
        N++;
    }

    public T remove(int i) {
//
//        if (i < 0 || i > N - 1) {
//            throw new RuntimeException("删除元素的位置不合法！");
//        }

        T current = eles[i];
        for (int index = i; index < N - 1; index++) {
            eles[index] = eles[index + 1];

        }
        N--;
//先删除再判断是否重置数组长度
        if (N > 0 && N < eles.length / 4) {
            resize(eles.length / 2);
        }

        return current;
    }

    public int indexOf(T t) {
        if (t == null) {
            throw new RuntimeException("查找元素不合法!");
        }
        for (int i = 0; i < N; i++) {
            if (eles[i].equals(t)) {
                return i;
            }
        }
//        如果找不到该元素，则返回-1
        return -1;
    }

    private void resize(int newsize) {
        T[] temp = eles;
        eles = (T[]) new Object[newsize];
//        temp.length是表的容量，N才是元素的个数
        for (int i = 0; i < N; i++) {
//        for (int i = 0; i < temp.length; i++) {
            eles[i] = temp[i];
        }
    }
//返回该表的容量
    public int capacity(){
        return eles.length;
    }

    public Iterator<T> iterator() {
        return new SIterator();
    }


    private class SIterator implements Iterator {

        private int cur;

        public void SIterator() {
            this.cur = 0;
        }

        @Override
        public boolean hasNext() {
            return cur < N;
        }

        @Override
        public T next() {
            return eles[cur++];

        }

    }








/*
    //存储元素的数组
    private T[] eles;
    //记录当前顺序表中的元素个数
    private int N;

    //构造方法
    public SequenceList(int capacity){
        //初始化数组
        this.eles=(T[])new Object[capacity];
        //初始化长度
        this.N=0;
    }

    //将一个线性表置为空表
    public void clear(){
        this.N=0;
    }

    //判断当前线性表是否为空表
    public boolean isEmpty(){
        return N==0;
    }

    //获取线性表的长度
    public int length(){
        return N;
    }

    //获取指定位置的元素
    public T get(int i){
        return eles[i];
    }

    //向线型表中添加元素t
    public void insert(T t){
        if (N==eles.length){
            resize(2*eles.length);
        }

        eles[N++]=t;
    }

    //在i元素处插入元素t
    public void insert(int i,T t){
        if (N==eles.length){
            resize(2*eles.length);
        }

        //先把i索引处的元素及其后面的元素依次向后移动一位
        for(int index=N;index>i;index--){
            eles[index]=eles[index-1];
        }
        //再把t元素放到i索引处即可
        eles[i]=t;

        //元素个数+1
        N++;
    }

    //删除指定位置i处的元素，并返回该元素
    public T remove(int i){
        //记录索引i处的值
        T current = eles[i];
        //索引i后面元素依次向前移动一位即可
        for(int index=i;index<N-1;index++){
            eles[index]=eles[index+1];
        }
        //元素个数-1
        N--;

        if (N<eles.length/4){
            resize(eles.length/2);
        }

        return current;
    }


    //查找t元素第一次出现的位置
    public int indexOf(T t){
        for(int i=0;i<N;i++){
            if (eles[i].equals(t)){
                return i;
            }
        }
        return -1;
    }

    //根据参数newSize，重置eles的大小
    public void resize(int newSize){
        //定义一个临时数组，指向原数组
        T[] temp=eles;
        //创建新数组
        eles=(T[])new Object[newSize];
        //把原数组的数据拷贝到新数组即可
        for(int i=0;i<N;i++){
            eles[i]=temp[i];
        }
    }


    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator{
        private int cusor;
        public SIterator(){
            this.cusor=0;
        }
        @Override
        public boolean hasNext() {
            return cusor<N;
        }

        @Override
        public Object next() {
            return eles[cusor++];
        }
    }
*/

}
