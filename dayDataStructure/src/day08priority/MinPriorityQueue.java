package day08priority;

public class MinPriorityQueue<T extends Comparable<T>> {
    private T[] item;
    private int N;

    public MinPriorityQueue(int capacity) {
        this.item = (T[]) new Comparable[capacity+1];
        this.N = 0;
    }

    public boolean isEmpty(){
        return N==0;
    }
    public int size(){
        return N;
    }
    public void insert(T t){
        item[++N] = t;
        swim(N);
    }

    private void swim(int k) {
        while (k > 1){
            if (!less(k/2,k)){
                exch(k/2,k);
            }
            k = k/2;
        }
    }



    //交换堆中i索引和j索引处的值
    private void exch(int i, int j) {
        T temp = item[i];
        item[i] = item[j];
        item[j] = temp;
    }

    public boolean less(int i, int j){
        return item[i].compareTo(item[j])<0;
    }

    public T delMin(){
        T min = item[1];
        exch(1,N);
        item[N] = null;
        N--;
        sink(1);
        return min;
    }

    public void sink(int k){
        int min = 0;
        while (2*k <= N){
            if (2*k+1 <= N){
                if (less(2*k, 2*k+1))
                {
                    min = 2*k;
                }else {
                    min = 2*k+1;
                }
            }else {
                min = 2*k;
            }
            if (less(k, min)){
                break;
            }
            exch(k, min);
            k = min;
        }
    }
}
