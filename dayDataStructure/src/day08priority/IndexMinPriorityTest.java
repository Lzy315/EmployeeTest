package day08priority;
/*索引优先队列2022.03.06*/
public class IndexMinPriorityTest {
    public static void main(String[] args) {
        //创建索引最小优先队列对象
        IndexMinPriorityQueue<String> queue = new IndexMinPriorityQueue<>(10);

        //往队列中添加元素
        queue.insert(0,"A");
        queue.insert(1,"C");
        queue.insert(2,"F");

        //测试修改
        queue.changeItem(0,"x");

        //测试删除
        while(!queue.isEmpty()){
            int index = queue.delMin();
            System.out.print(index+" ");
        }


    }
}
