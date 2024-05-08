package MatrixPackage;

public class SubstractMatrix {

    public static void main(String[] args) {

        int a [][] = {{9,8}, {8,7}};
        int b [][] = {{5,3}, {3,5}};

        int c [][] = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] - b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
