package day09File;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
// 创建流对象
        BufferedReader br = new BufferedReader(new FileReader("out.txt"));
// 定义字符串,保存读取的一行文字
        String line = null;
// 循环读取,读取到最后返回null
        while ((line = br.readLine())!=null) {
            System.out.print(line);
            System.out.println("‐‐‐‐‐‐");
        }
// 释放资源L
        br.close();
    }

//
//    public static void main(String[] args) throws IOException {
//// 创建流对象
//        BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
//// 写出数据
//        bw.write("黑马");
//// 写出换行
//        bw.newLine();
//        bw.write("程序");
//        bw.newLine();
//        bw.write("员");
//        bw.newLine();
//// 释放资源
//        bw.close();
//    }
}
