package day10Graph;

public class DepthFirstSearch {
    //索引代表顶点，值表示当前顶点是否已经被搜索
    private boolean[] marked;
    //记录有多少个顶点与s顶点相通
    private int count;

    //构造深度优先搜索对象，使用深度优先搜索找出G图中s顶点的所有相邻顶点
    public DepthFirstSearch(Graph G,int s){
        this.count = 0;
        marked = new boolean[G.V()]; //用来判断图中的顶点是否已经被搜索过。
        dfs(G,s);
    }


    //使用深度优先搜索找出G图中v顶点的所有相通顶点
    private void dfs(Graph G, int v){
        marked[v] = true;
        for (Integer w:G.adj(v)){
            if (!marked[w]){
                dfs(G,w);
            }
        }
        count++;
    }


    //判断w顶点与s顶点是否相通
    public boolean marked(int w){
        return marked[w];
    }


    //获取与顶点s相通的所有顶点的总数
    public int count()
    {
        return count;
    }
}
