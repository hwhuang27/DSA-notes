package leetcode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Sol1672 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},{1,2,3}};
        int[][] arr2 = {{1,5},{7,3},{3,5}};
        int ans = maximumWealth(arr2);
        System.out.println(ans);
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        int count = 0;

        for (int[] arr:
             accounts) {
            for (int i = 0; i < arr.length; i++) {
                count = count + arr[i];
            }
            if (count > max){
                max = count;
            }
            count = 0;
        }
        return max;
    }
}
