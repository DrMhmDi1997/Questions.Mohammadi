package ArrayPackage;

import java.util.Arrays;

public class SmallestNum {

    public static void main(String[] args) {

        int[] arr = {7,9,0,7,8,5,-3};
        System.out.println(getSmallest(arr,7));

    }

    public static int getSmallest(int[] a, int total ) {
        Arrays.sort(a);
        return a[0];
    }
}
