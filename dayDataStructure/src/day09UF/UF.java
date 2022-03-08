package day09UF;

public class UF {
    public int[] eleAndGroup;
    private int count; //分组个数；
    //初始化并查集
    public UF(int N){

        eleAndGroup = new int[N];
        this.count = N;

        for (int i = 0; i < N; i++) {
            eleAndGroup[i] = i;
        }


    }

    //获取当前并查集中的数据有多少个分组
    public int count(){
        return count;
    }

    //元素p所在分组的标识符
    public int find(int p){
        return eleAndGroup[p];

    }

    //判断并查集中元素p和元素q是否在同一分组中
    public boolean connected(int p,int q){
        return find(p) == find(q);
    }

    //把p元素所在分组和q元素所在分组合并
    public void union(int p,int q){
        if (connected(p,q)){
            return;
        }
        int pGroup = find(p);
        int qGroup = find(q);

        for (int i = 0; i < eleAndGroup.length; i++) {
            if (eleAndGroup[i] == pGroup){
//                查找各个索引（结点元素）的分组标识，等于p元素所在分组的索引(结点元素)就都换成q元素的分组标识
                eleAndGroup[i] = qGroup;
            }
        }
        this.count--;  //分组数减一
    }
}
