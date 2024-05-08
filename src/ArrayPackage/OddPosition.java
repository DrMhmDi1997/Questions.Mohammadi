package ArrayPackage;

public class OddPosition {

    public static void main(String[] args) {

        int[] arr = {0,8,7,5,8,5,7,4};
        System.out.println("Print numbers in odd position:");

        for (int i = 0; i < arr.length ; i = i +2) {
            System.out.println(arr[i]);
        }
    }
}
