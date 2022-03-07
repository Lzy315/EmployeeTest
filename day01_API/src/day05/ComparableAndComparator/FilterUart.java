package day05.ComparableAndComparator;

import java.util.Iterator;
import java.util.Map;

class FilterChart {
    public static void main(String[] args) {
//        int[] t1 = {1,2,3,4,5};
//        double y1,y2;
//        y1 = t1[0];
//        for (int i = 1; i < t1.length; i++) {
//            y2 = y1*0.9 + t1[i] * 0.1;
//            y1 = y2;
//        }
        System.out.println(filterChart(1, 1));
    }

    public static double filterChart(int...arr) {
        double y1, y2;
        y1 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            y2 = y1 * 0.9 + arr[i] * 0.1;
            y1 = y2;
        }
        return y1;
    }

}

