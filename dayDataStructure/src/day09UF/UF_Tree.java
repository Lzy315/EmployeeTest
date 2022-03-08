package day09UF;

public class UF_Tree {
    public int[] eleAndGroup;
    private int count; //分组个数；
    //初始化并查集
    public UF_Tree(int N){

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

/*        while (p != eleAndGroup[p]){
            p = eleAndGroup[p];
        }
        return p;*/
        while(true){

            if (p == eleAndGroup[p]){
                return p;
            }

            p = eleAndGroup[p];
        }


    }

    //判断并查集中元素p和元素q是否在同一分组中
    public boolean connected(int p,int q){
        return find(p) == find(q);
    }

    //把p元素所在分组和q元素所在分组合并
    public void union(int p,int q){
/*        if (connected(p,q)){
            return;
        }
        eleAndGroup[p] = q;
        this.count--;  //分组数减一*/

        int pRoot = find(p);
        int qRoot = find(q);

        //如果p和q已经在同一分组，则不需要合并了
        if (pRoot==qRoot){
            return;
        }

        //让p所在的树的根结点的父结点为q所在树的根结点即可
        eleAndGroup[pRoot] = qRoot;

        //组的数量-1

        this.count--;
    }

}
