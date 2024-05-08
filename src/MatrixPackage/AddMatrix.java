package MatrixPackage;

public class AddMatrix {

    public static void main(String[] args) {

        int a [] [] = {{2,3,6},{7,9,8},{6,9,8}};
        int b [] [] = {{7,6,5}, {6,7,5}, {1,2,3}};

        int c [] [] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c [i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }



    }
}
