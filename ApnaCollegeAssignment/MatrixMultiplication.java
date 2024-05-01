import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number of Rows:");
        int row = input.nextInt();
        System.out.println("Enter the Number of Columns:");
        int col = input.nextInt();
        int[][] Matrix1 = new int[row][col];
        int[][] Matrix2 = new int[row][col];
        int[][] Matrix3 = new int[row][col];
        System.out.println("Enter Elements in First Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter Elements in Second Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Matrix2[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Matrix3[i][j] = 0;
                for (int k = 0; k < col; k++) {
                    Matrix3[i][j] += Matrix1[i][k] * Matrix2[k][j];
                }
            }
        }
        System.out.println("Resultant Matrix after Multiplication:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(Matrix3[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
