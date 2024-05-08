public class EvenPosition {

    public static void main(String[] args) {

        int[] array = {1,6,8,4,9,3,0};
        System.out.println("Print the numbers on even position:");

        for (int i = 1; i < array.length; i = i +2) {
            System.out.println(array[i]);
        }
    }
}
