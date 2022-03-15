package day08priority;
/*索引优先队列2022.03.06*/
public class IndexMinPriorityQueue<T extends Comparable<T>> {
    private T[] item;
    private int N;
    private int[] pq;
    private int[] qp;

    public IndexMinPriorityQueue(int capacity) {
        this.item = (T[]) new Comparable[capacity+1];
        this.N = 0;
        this.pq = new int [capacity+1];
        this.qp = new  int[capacity+1];
        for (int i = 0; i < pq.length; i++) {
            qp[i] = -1;
        }
    }

    public boolean isEmpty(){
        return N==0;
    }
    public int size(){
        return N;
    }
    public boolean contains(int i){
        return qp[i] != -1;
    }
    //最小元素关联的索引
    public int minIndex() {

        return pq[1];
    }

    public void insert(int i, T t){
        if (contains(i)){
            return;
        }
        item[i] = t;
        N++;
        pq[N] = i;
        qp[i] = N;
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
        //交换pq中的数据
        int tmp = pq[i];
        pq[i] = pq[j];
        pq[j] = tmp;

        //更新qp中的数据,pq的元素值是qp的索引，pq的索引值是qp的元素值
        qp[pq[i]]=i;
        qp[pq[j]] =j;
    }

    public boolean less(int i, int j){
        return item[pq[i]].compareTo(item[pq[j]])<0;
    }




    public int  delMin(){

        int min = minIndex();
        exch(1,N);
        qp[pq[N]] = -1;
        item[pq[N]] = null;
        pq[N] = -1;

        //删除items中对应的内容
//        items[min] = null;
        N--;
        sink(1);
        return min;
    }

    public void delete(int i) {
        int k = qp[i];
        exch(k, N);//把要删除的元素对应的索引挪到最后，便于删除。

        qp[pq[N]] = -1;
        pq[N] = -1;
        item[i] = null;

        sink(k); //下沉，大的往下走
        swim(k); //再上浮，小的往上走
    }

    //把与索引i关联的元素修改为为t
    public void changeItem(int i, T t) {
        //修改items数组中i位置的元素为t
        item[i] = t;
        int k = qp[i];

        sink(k);
        swim(k);

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


//    源代码


/*//存储堆中的元素
private T[] items;
    //保存每个元素在items数组中的索引，pq数组需要堆有序
    private int[] pq;
    //保存qp的逆序，pq的值作为索引，pq的索引作为值
    private int[] qp;
    //记录堆中元素的个数
    private int N;


    public IndexMinPriorityQueue(int capacity) {
        this.items = (T[]) new Comparable[capacity+1];
        this.pq = new int[capacity+1];
        this.qp= new int[capacity+1];
        this.N = 0;

        //默认情况下，队列中没有存储任何数据，让qp中的元素都为-1；
        for (int i = 0; i < qp.length; i++) {
            qp[i]=-1;
        }

    }

    //获取队列中元素的个数
    public int size() {
        return N;
    }

    //判断队列是否为空
    public boolean isEmpty() {
        return N==0;
    }

    //判断堆中索引i处的元素是否小于索引j处的元素
    private boolean less(int i, int j) {

        return items[pq[i]].compareTo(items[pq[j]])<0;
    }

    //交换堆中i索引和j索引处的值
    private void exch(int i, int j) {
        //交换pq中的数据
        int tmp = pq[i];
        pq[i] = pq[j];
        pq[j] = tmp;


        //更新qp中的数据
        qp[pq[i]]=i;
        qp[pq[j]] =j;

    }

    //判断k对应的元素是否存在
    public boolean contains(int k) {

        return qp[k] !=-1;
    }

    //最小元素关联的索引
    public int minIndex() {

        return pq[1];
    }


    //往队列中插入一个元素,并关联索引i
    public void insert(int i, T t) {
        //判断i是否已经被关联，如果已经被关联，则不让插入

        if (contains(i)){
            return;
        }
        //元素个数+1
        N++;
        //把数据存储到items对应的i位置处
        items[i] = t;
        //把i存储到pq中
        pq[N] = i;
        //通过qp来记录pq中的i
        qp[i]=N;

        //通过堆上浮完成堆的调整

        swim(N);

    }

    //删除队列中最小的元素,并返回该元素关联的索引
    public int delMin() {
        //获取最小元素关联的索引
        int minIndex = pq[1];

        //交换pq中索引1处和最大索引处的元素
        exch(1,N);
        //删除qp中对应的内容
        qp[pq[N]] = -1;
        //删除pq最大索引处的内容
        pq[N]=-1;
        //删除items中对应的内容
        items[minIndex] = null;
        //元素个数-1
        N--;
        //下沉调整
        sink(1);

        return minIndex;
    }

    //删除索引i关联的元素
    public void delete(int i) {
        //找到i在pq中的索引
        int k = qp[i];

        //交换pq中索引k处的值和索引N处的值
        exch(k,N);
        //删除qp中的内容
        qp[pq[N]] = -1;
        //删除pq中的内容
        pq[N]=-1;
        //删除items中的内容
        items[i]=null;
        //元素的数量-1
        N--;
        //堆的调整
        sink(k);
        swim(k);
    }

    //把与索引i关联的元素修改为为t
    public void changeItem(int i, T t) {
        //修改items数组中i位置的元素为t
        items[i] = t;
        //找到i在pq中出现的位置
        int k = qp[i];
        //堆调整
        sink(k);
        swim(k);
    }



    //使用上浮算法，使索引k处的元素能在堆中处于一个正确的位置
    private void swim(int k) {
        while(k>1){
            if (less(k,k/2)){
                exch(k,k/2);
            }

            k = k/2;
        }
    }


    //使用下沉算法，使索引k处的元素能在堆中处于一个正确的位置
    private void sink(int k) {
        while(2*k<=N){
            //找到子结点中的较小值
            int min;
            if (2*k+1<=N){
                if (less(2*k,2*k+1)){
                    min = 2*k;
                }else{
                    min = 2*k+1;
                }
            }else{
                min = 2*k;
            }
            //比较当前结点和较小值
            if (less(k,min)){
                break;
            }

            exch(k,min);
            k = min;
        }
    }*/


}
