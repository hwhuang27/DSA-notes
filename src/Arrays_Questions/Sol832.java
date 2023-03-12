package Arrays_Questions;

import java.util.Arrays;

public class Sol832 {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] ans = flipAndInvertImage(image);
        System.out.println(Arrays.deepToString(ans));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int[] row: image) {
            for (int i = 0; i*2 < n; i++) {
                if (row[i] == row[n-i-1]){
                    row[i] = row[n-i-1] ^= 1;
                }
            }
        }
        return image;
    }
}