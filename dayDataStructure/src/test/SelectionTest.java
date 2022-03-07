package test;

import java.util.Arrays;

/*选择排序*/
public class SelectionTest {
    public static void main(String[] args) {
        Integer[] a = {4, 200, 8, 7, 100, 2, 10, 1, 45};
        int temp;
        int minIndex;


/*        *//*整体实现2022.03.02*//*
        for (int i = 0; i < a.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[minIndex] > a[j]) {
                    temp = a[minIndex];
                    a[minIndex] = a[j];
                    a[j] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(a));*/




















/*        for (int i = 0; i < a.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j <=a.length - 1; j++) {
                if (a[minIndex] > a[j])
                    minIndex = j;
            }
            temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
        System.out.println(Arrays.toString(a));

    }*/


/*    public static void main(String[] args) {
        Integer[] a = {4, 6, 8, 7, 9, 2, 10, 1};
        int temp;
//        最小值的索引
        int min = 0;
        for (int i = 0; i < a.length - 1; i++) {
            min = i;
            for (int j = i+1; j < a.length ; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
//                else continue;
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        System.out.println(Arrays.toString(a));
    }*/
    }
}
