package day14;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
//函数式接口部分的代码
public class Demo03LoggerDelay {
    //    private static void log(int level, MessageBuilder builder) {
//        if (level == 1) {
//            System.out.println(builder.buildMessage());
//        }
//    }
//    public static void main(String[] args) {
//        String msgA = "Hello";
//        String msgB = "World";
//        String msgC = "Java";
//        log(2, () -> {
//            System.out.println("Lambda");
//            return msgA + msgB + msgC;
//        });
//    }

/*    private static void consumeString(String name,Consumer<String> function) {
        function.accept(name);
    }

    public static void main(String[] args) {
        consumeString("string",(String name) -> System.out.println(name));
    }*/


/*    private static void consumeString(Consumer<String> one, Consumer<String> two) {
        one.andThen(two).accept("HEllo");
    }
    public static void main(String[] args) {
        consumeString(
                s -> System.out.println(s.toUpperCase()),
                s -> System.out.println(s.toLowerCase()));
    }*/

/*    public static void main(String[] args) {
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男" };
        printInfo(s -> System.out.print("姓名：" + s.split(",")[0]),
                s -> System.out.println("。性别：" + s.split(",")[1] + "。"),
                array);
    }
    private static void printInfo(Consumer<String> one, Consumer<String> two, String[] array) {
        for (String info : array) {
            one.andThen(two).accept(info); // 姓名：迪丽热巴。性别：女。
        }
    }*/

/*    private static void method(Predicate<String> predicate) {
        boolean veryLong = predicate.negate().test("HelloWorld");
        System.out.println("字符串很长吗：" + veryLong);
    }
    public static void main(String[] args) {
        method(s->s.length()< 5);
    }*/


/*//    1. 将字符串截取数字年龄部分，得到字符串；
//2. 将上一步的字符串转换成为int类型的数字；
//3. 将上一步的int数字累加100，得到结果int数字。
    private static void method(String str, Function<String, String> one, Function<String, Integer> two, Function<Integer,Integer> three) {
        int num = one.andThen(two).andThen(three).apply(str);
        System.out.println(num);
    }
    public static void main(String[] args) {
        String str = "赵丽颖,20";
        method(str,(s1)->s1.split(",")[1],(s2)->Integer.parseInt(s2),integer -> integer += 100); //220
    }*/

}
