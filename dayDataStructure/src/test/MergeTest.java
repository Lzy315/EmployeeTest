package test;

import day03sort.Merge;

import java.util.Arrays;

/*归并排序 2022.02.19*/
public class MergeTest {
    public static void main(String[] args) throws Exception{
//        Integer[] a = {8,4,5,7,1,3,6,2};
        Integer[] a = {8,4,5,2};
        Merge.sort(a);
        System.out.println(Arrays.toString(a));//{1,2,3,4,5,6,7,8}

    }
}
