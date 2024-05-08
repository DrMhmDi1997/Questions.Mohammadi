package Search;

public class Linear {

    public static void main(String[] args) {

        int[] array = {7,9,8,7,6,5,8,7,4,7,6,5};
        int key = 4;
        System.out.println(key + "is found at" + linearSearch(array,key));
    }

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
if (array[i] == key) {
    return i;
}
        }
        return - 1;
    }
}
