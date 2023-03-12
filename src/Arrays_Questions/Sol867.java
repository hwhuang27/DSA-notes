package Arrays_Questions;

import java.util.Arrays;

public class Sol867 {
    public static void main(String[] args) {
        //int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix = {{1,2,3},{4,5,6}};
        int[][] ans = transpose(matrix);
        System.out.println(Arrays.deepToString(ans));
    }
    public static int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] transposed = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
}
