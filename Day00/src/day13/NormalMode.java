package day13;

import java.util.ArrayList;
 //普通红包
public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int count) {
        ArrayList list = new ArrayList();

        int avg,mod;
        avg = totalMoney / count;
        mod = totalMoney % count;
        for (int i = 0; i < count - 1 ; i++) {
            list.add(avg);
        }
        list.add(avg + mod);
        return list;
    }
}
