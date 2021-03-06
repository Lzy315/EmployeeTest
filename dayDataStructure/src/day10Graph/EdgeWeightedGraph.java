package day10Graph;

import day04Linear.Queue;
/*加权无向图 2022.03.14*/
public class EdgeWeightedGraph {
    //顶点总数
    private final int V;
    //边的总数
    private int E;
    //邻接表
    private Queue<Edge>[] adj;

    //创建一个含有V个顶点的空加权无向图
    public EdgeWeightedGraph(int V) {
        //初始化顶点数量
        this.V = V;
        //初始化边的数量
        this.E = 0;
        //初始化邻接表
        adj = new Queue[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new Queue<Edge>();
        }
    }

    //获取图中顶点的数量
    public int V() {
        return V;
    }

    //获取图中边的数量
    public int E() {
        return E;
    }


    //向加权无向图中添加一条边e
    public void addEdge(Edge e) {
        //需要让边e同时出现在e这个边的两个顶点的邻接表中
        int v = e.either();
        int w = e.other(v);
//       索引是顶点，元素是一个边队列
        adj[v].enqueue(e);
        adj[w].enqueue(e);
        //边的数量+1
        E++;
    }

    //获取和顶点v关联的所有边
    public Queue<Edge> adj(int v) {
        return adj[v];
    }

    //获取加权无向图的所有边
    public Queue<Edge> edges() {

        //创建一个队列对象，存储所有的边
        Queue<Edge> allEdges = new Queue<>();

        //遍历图中的每一个顶点，找到该顶点的邻接表，邻接表中存储了该顶点关联的每一条边
        for (int v = 0; v < V; v++) {
            for (Edge e : adj[v]) {
//                因为这是无向图，所以同一条边同时出现在了它关联的两个顶点的邻接表中，需要让一条边只记录一次；

                if (e.other(v)<v){
                    allEdges.enqueue(e);
                }

              /*  if (e.either() < e.other(e.either())){
                    allEdges.enqueue(e);
                }*/
            }
        }
        return allEdges;
    }
}
