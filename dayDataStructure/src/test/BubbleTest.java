package test;

import day03sort.Bubble;

import java.util.Arrays;
/*冒泡排序*/
public class BubbleTest {
    public static void main(String[] args) {
        Integer[] a = {4, 5, 6, 3, 1,13,2,56,31};
        int temp;

/*API实现*/
/*        Bubble.sort(a);
        System.out.println(Arrays.toString(a));*/


        /*整体实现*/
/*        for (int i = a.length - 1; i>0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(a));*/




/*整体实现2022.03.02*/
        for (int i = a.length - 1; i > 0; i-- ) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                } else continue;
            }
        }
        System.out.println(Arrays.toString(a));
    }




}
