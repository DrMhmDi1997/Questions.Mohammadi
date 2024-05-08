package ArrayPackage;

public class OddEven {

    public static void main(String[] args) {

        int[] array = {7,9,8,10,8,6,5,9,4,3,9};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i] + "is odd");
            }
            if (array[i] % 2 == 0) {
                System.out.println(array[i] + " is even");
            }
        }
    }
}
