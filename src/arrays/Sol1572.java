package arrays;

public class Sol1572 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int ans = diagonalSum(matrix);
        System.out.println(ans);

    }

    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int m = mat.length-1;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j){
                    sum += mat[i][j];
                }
                if(j == m){
                    sum += mat[i][j];
                    m--;
                }
            }

        }
        // if n is odd, minus the center value
        if(n%2 == 1){
            sum -= mat[n/2][n/2];
        }
        return sum;
    }
}
