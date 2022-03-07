package day13;

import java.util.ArrayList;
import java.util.Random;

//手气红包，最少一分钱，最多不超过“剩下平均数的2倍”
public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int count) {
        ArrayList list = new ArrayList();
        Random r = new Random();
        int leftMoney = totalMoney;
        int leftCount = count;
        int money;

        for (int i = 0; i < count - 1 ; i++) {
            money = 1 + r.nextInt(leftMoney / leftCount) * 2;
            list.add(money);
            leftMoney = totalMoney - money;
            leftCount--;
        }
        list.add(leftMoney);

        return list;
    }
}
