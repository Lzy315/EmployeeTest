package day15;

import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        Stream<String> original = Stream.of("张无忌", "张三丰", "周芷若");
        Stream<String> result = original.filter(s->s.startsWith("张"));
//        result.forEach(System.out::println); //方法引用
        result.forEach(name-> System.out.println(name));///接收一个Consumer 接口函数，会将每一个流元素交给该函数进行处理。
//        System.out.println(result);
    }
}
