package ArrayPackage;

public class ArraySum {

    public static void main(String[] args) {
        int[] arr = {5,8,7,9,0,6,5,8,4,3,8,7,1,5,2};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
sum = sum + arr[i];
        }

        System.out.println(sum);
    }
}
