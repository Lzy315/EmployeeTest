package day11;

import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        ArrayList<Integer> list = new ArrayList<>();  //集合，用来存放多个红包的数值
        if (totalMoney > getMoney()) {
            System.out.println("余额不足");
            return list;
        }

        super.setMoney(super.getMoney() - totalMoney); //扣钱
        int avgMoney = totalMoney / count;
        int mod = totalMoney % count;  //余额
        for (int i = 0; i < count - 1; i++) {
            list.add(avgMoney);
        }
        list.add(avgMoney + mod);
        return list;
    }
}
