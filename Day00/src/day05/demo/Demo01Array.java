package day05.demo;

import java.util.Arrays;

public class Demo01Array {
    public static void main(String[] args) {
        /*动态初始化数组*/
//    int[] arrayA = new int[100]; //动态初始化
//    short[] arrayB = new short[3];
//    long[] arrayC = new long[2];
//    char[] arrayD = new char[2];
//        char[] arrayD;
//        arrayD = new char[2]; //拆分格式
        /*静态初始化数组*/
//        int[] arrayV = new int[] { 1, 2, 3};
//        byte[] arrayG = new byte[] { 4, 5 ,6};
//        byte[] arrayG;
//        arrayG = new byte[]{4, 5, 6}; //拆分格式
        /*静态格式的省略格式初始化数组*/
//        int[] arrayA = {10, 11, 12};
//        byte[] arrayB = {1, 2, 3};
        int[] arrayA = new int[8];
        int[] arrayB = new int[]{1, 2, 3, 4, 5, 6};
        int valChange;
//        System.out.println(arrayA.length);
////        System.out.println(arrayB.length);
        for (int i = 0; i < arrayB.length; i++) {
            System.out.println(arrayB[i]);
        }
/*        System.out.println("-----------------------------");
        for (int i = 0, j = arrayB.length - 1; i < arrayB.length / 2; i++, j--) {
            valChange = arrayB[i];
            arrayB[i] = arrayB[j];
            arrayB[j] = valChange;
        }*/
//        System.out.println("-----------------------------");
//        for (int i = 0; i < arrayB.length; i++) {
//            System.out.println(arrayB[i]);
//        }
        arrayA = arrayConvert(arrayB);
        printArray(arrayA);
        System.out.println("==========================");
        System.out.println( Arrays.toString(arrayB));


    }

    public static int[] arrayConvert(int[] arrayB) {
        int valChange;
        for (int i = 0, j = arrayB.length - 1; i < arrayB.length / 2; i++, j--) {
            valChange = arrayB[i];
            arrayB[i] = arrayB[j];
            arrayB[j] = valChange;
        }
        return arrayB;
    }

    public static void printArray(int[] array) {
        System.out.println("-----------------------------");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
