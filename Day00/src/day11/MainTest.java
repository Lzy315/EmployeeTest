package day11;
/*p170 day09_18 发普通红包案例实现*/
import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args) {
        ArrayList<Integer> list;
        Manager Qunzhu = new Manager("群主", 100);

        Member one = new Member("成员A", 1);
        Member two = new Member("成员B", 1);
        Member three = new Member("成员C", 1);

        Qunzhu.show();
        one.show();
        two.show();
        three.show();

        System.out.println("=================================");

        list = Qunzhu.send(20, 3); //群主发红包钱数和个数，得到普通红包钱数的集合。
        one.receive(list);
        two.receive(list);
        three.receive(list);

        Qunzhu.show();
        one.show();
        two.show();
        three.show();

    }
}
