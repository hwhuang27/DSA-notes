package arrays;

import java.util.ArrayList;
import java.util.List;

public class Sol1380 {
    public static void main(String[] args) {
        int[][] mat = {{3,7,8},{9,11,13},{15,16,17}};
        //int[][] mat = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        List<Integer> ans = luckyNumbers(mat);
        System.out.println(ans);
    }

    public static List<Integer> luckyNumbers (int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[] row_min_values = new int[row];
        int[] col_indices = new int[row];

        for (int i = 0; i < row; i++) {
            int row_min = Integer.MAX_VALUE;
            int index_min = 0;
            for (int j = 0; j < col; j++) {
                if(matrix[i][j] < row_min){
                    row_min = matrix[i][j];
                    index_min = j;
                }
            }
            row_min_values[i] = row_min;
            col_indices[i] = index_min;
        }

        List<Integer> out = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            int count = 0;
            int value = row_min_values[i];
            for (int[] rows : matrix) {
                if (value > rows[col_indices[i]]) {
                    count++;
                }
            }
            if (count == row-1){
                out.add(value);
            }
        }
        return out;
    }
}
