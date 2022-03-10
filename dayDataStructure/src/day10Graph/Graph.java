package day10Graph;


import day04Linear.Queue;
public class Graph {
    private final int V;  //顶点数
    private int E;  //边数
    private Queue<Integer>[] adj;

    public Graph(int v) {
        V = v;
        E = 0;
        this.adj = new Queue[v];
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new Queue<Integer>();
        }
    }

    //获取顶点数目
    public int V(){
        return V;
    }
    //获取边的数目
    public int E(){
        return E;
    }

    //向有向图中添加一条边 v->w
    public void addEdge(int v, int w) {
        adj[v].enqueue(w);
        adj[w].enqueue(v);
        E++;
    }
    //获取和顶点v相邻的所有顶点
    public Queue<Integer> adj(int v){
        return adj[v];
    }

}
