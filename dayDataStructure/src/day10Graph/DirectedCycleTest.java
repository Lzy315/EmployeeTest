package day10Graph;

import java.io.BufferedReader;
import java.io.FileReader;

public class DirectedCycleTest {
    public static void main(String[] args) throws Exception {
//创建输入流
        BufferedReader reader = new BufferedReader(new FileReader("G:\\IDEAProjects\\EmployeeTest\\dayDataStructure\\cycle_test.txt"));
//读取顶点个数，初始化Graph图
        int number = Integer.parseInt(reader.readLine());
        Digraph G = new Digraph(number);
//读取边的个数
        int roadNumber = Integer.parseInt(reader.readLine());
//读取边，并调用addEdge方法
        for (int i = 0; i < roadNumber; i++) {
            String line = reader.readLine();
            int p = Integer.parseInt(line.split(" ")[0]);
            int q = Integer.parseInt(line.split(" ")[1]);
            G.addEdge(p, q);
        }
//创建测试检测环对象
        DirectedCycle cycle = new DirectedCycle(G);
//输出图中是否有环
        System.out.println(cycle.hasCycle());
    }
}
