package ArrayPackage;

import java.util.Arrays;

public class LargestNum {

    public static void main(String[] args) {

        int [] array = {7,9,8,6,0,5};

        System.out.println(getLargest(array,6));

    }

    public static int getLargest(int[] a, int total) {
        Arrays.sort(a);
         return a [total - 1];
    }
}
