package test;

import java.util.Arrays;
/*插入排序2022.02.19*/
public class InsertionTest {
    public static void main(String[] args) {
        Integer[] a = {4,3,2,10,12,1,5,6};
        int temp;
        int insertIndex;


//整体实现2022.03.02，忘记写else的情况

        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (a[j] < a[j-1]){
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
//                遇到小于等于待插入元素的，说明找到合适位置了，就本次终止循环。
                else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(a));
















/*        for (int i = 1; i <= a.length - 1; i++) {
            insertIndex = i;
            for (int j = i-1; j >= 0; j--) {
                if (a[j] > a[insertIndex]) {
                    temp = a[insertIndex];
                    a[insertIndex] = a[j];
                    a[j] = temp;
                    insertIndex = j;
                }
//                遇到小于等于待插入元素的，说明找到合适位置了，就本次终止循环。
                else {
                break;
                }
            }

        }*/

/*        for (int i = 1; i <= a.length - 1; i++) {
//            insertIndex = i;
            for (int j = i; j > 0; j--) {
                if (a[j-1] > a[j]) {
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
//                    insertIndex = j;
                }
                else {
                    break;
                }
            }

        }*/
        System.out.println(Arrays.toString(a));
    }
}
