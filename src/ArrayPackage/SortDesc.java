package ArrayPackage;

public class SortDesc {

    public static void main(String[] args) {


        int[] arr = {7,9,8,0,6,5,4,7,6,3,2};
        int temp = 0;

        System.out.println("Dispaly the main array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

//        How to sort in descending way
        for (int i = 0; i < arr.length; i++) {
            for (int j = i +1; j < arr.length ; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }




            }
        System.out.println();

        System.out.println("Desencding way");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        }
    }

