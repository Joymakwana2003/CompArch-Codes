import java.util.Random;

public class MatrixMultiDouble {
    public static void main(String[] args) {
        Random random = new Random();

        int n = 3;

        double[][] Arr1 = new double[n][n];
        double[][] Arr2 = new double[n][n];
        double[][] Ans = new double[n][n];
        int joy = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Arr1[i][j] = random.nextInt(10);
                Arr2[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                joy = 0;
                for (int k = 0; k < n; k++) {
                    joy += Arr1[i][k] * Arr2[k][j];
                }
                Ans[i][j] = joy;
                System.out.print(Ans[i][j] + " ");
            }
        }
    }
}
