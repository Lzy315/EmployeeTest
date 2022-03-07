package test;

import java.util.Arrays;

/*希尔排序2022.02.19*/
public class ShellTest {
    public static void main(String[] args) {
        Integer[] a = {9, 1, 2, 90, 7, 4, 8, 6, 3, 5};
        int h = 1;
        int temp;
        while (h < a.length / 2) {
            h = h * 2 + 1;
        }

/*整体实现。2022.03.02*/
        while (h >= 1){
            for (int i = 0; i+h < a.length; i++) {
                for (int j = i + h; j >0; j -= h) {
                    if (a[j] < a[j-h]){
                        temp = a[j];
                        a[j] = a[j-h];
                        a[j-h] = temp;
                    }else {
                        break;
                    }

                }
            }

            h = h / 2 ;
        }

        System.out.println(Arrays.toString(a));



















/*            while (h >= 1) {
                for (int i = h; i < a.length; i++) {
                    for (int j = i; j>= h; j-=h) {
                        if (a[j] < a[j-h]){
                            temp = a[j];
                            a[j]=a[j-h];
                            a[j-h]=temp;
                        } else {
                            break;
                        }

                        }

                    }
                h = h / 2;
                }
        System.out.println(Arrays.toString(a));*/



        }

    }

