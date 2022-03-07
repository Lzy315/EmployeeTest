package day11;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }
    public void receive(ArrayList<Integer> redList) {
        int index = new Random().nextInt(redList.size());
       int redMoney = redList.remove(index);
       super.setMoney(super.getMoney() + redMoney);
    }
}
