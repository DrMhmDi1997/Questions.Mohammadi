package ArrayPackage;

public class LargestElement {

    public static void main(String[] args) {


        int[] array = {78,56,90,99,45,76,34};
        int Max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > Max) {
                Max = array[i];
            }
        }
        System.out.println(Max);
    }
}
