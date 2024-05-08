package ArrayPackage;

import java.util.Arrays;

public class SortAsc {

    public static void main(String[] args) {

        int[] array = {8,9,8,7,6,0,7};
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

//        How to sort
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length ; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }

        }

        System.out.println();
        System.out.println("Sort in ascending way:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
