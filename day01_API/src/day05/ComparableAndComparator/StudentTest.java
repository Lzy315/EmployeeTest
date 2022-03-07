package day05.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class StudentTest {
    public static void main(String[] args) {

        ArrayList<Student> list01 = new ArrayList();

        Student stu1 = new Student(18, "a张三");
        Student stu2 = new Student(18, "b李四");
        Student stu3 = new Student(22, "王五");

        list01.add(stu1);
        list01.add(stu2);
        list01.add(stu3);

        System.out.println("排序前： " + list01);
        /*sort(List<T> list)使用前提：
         * 被排序的集合里存储的元素，必须实现Comparable接口，重写接口中的comparatorTo方法定义排序规则 */
//        Collections.sort(list01);

        Collections.sort(list01, new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
//                升序
//                int result = student.getAge() - t1.getAge();
//                if (result == 0) {
//                    result = student.getName().charAt(0) - t1.getName().charAt(0);
//                }
//                return result;

//                降序
                int result = t1.getAge() - student.getAge();
                if (result == 0) {
//                     char charAt(int index):获取指定索引处的字符
                    result = t1.getName().charAt(0) - student.getName().charAt(0);
                }
                return result;

            }
        });

        System.out.println("排序后： " + list01);

        ArrayList<Integer> list02 = new ArrayList();
        list02.add(5);
        list02.add(4);
        list02.add(9);

        System.out.println("排序前： " + list02);
        Collections.sort(list02);
//
        Collections.sort(list02, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
//                降序
                return t1 - integer;
//                升序
//                return integer - t1;
            }
        });
        System.out.println("排序后： " + list02);
    }

}
