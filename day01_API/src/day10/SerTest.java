package day10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
/*
1. 把若干学生对象 ，保存到集合中。
2. 把集合序列化。
3. 反序列化读取时，只需要读取一次，转换为集合类型。
4. 遍历集合，可以打印所有的学生信息*/
public class SerTest {
    public static void main(String[] args) throws Exception {
// 创建 学生对象
        Student student = new Student("老王", "laow");
        Student student2 = new Student("老张", "laoz");
        Student student3 = new Student("老李", "laol");
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(student);
        arrayList.add(student2);
        arrayList.add(student3);
// 序列化操作
        serialize(arrayList);
// 反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("list.txt"));
// 读取对象,强转为Array􀀏ist类型
        ArrayList<Student> list = (ArrayList<Student>) ois.readObject();
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName() + "‐‐" + s.getPwd());
        }
    }

    private static void serialize(ArrayList<Student> arrayList) throws Exception {
// 创建 序列化流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("list.txt"));
// 写出对象
        oos.writeObject(arrayList);
// 释放资源
        oos.close();
    }
}
