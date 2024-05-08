package ArrayPackage;

public class MinimumElement {

    public static void main(String[] args) {

        int[] array = {78,90,89,7,67,56,0,45,43,786};
        int Min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < Min) {
                Min = array[i];
            }
        }
        System.out.println(Min);
    }
}
