package leetcode.Arrays;

import java.util.Arrays;

public class Sol1929 {
    public static void main(String[] args) {
        //int[] arr = {1,2,1};
        int[] arr = {1,3,2,1};
        int[] ans = getConcatenation(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] out = new int[2*nums.length];
        for (int i = 0; i < nums.length; i++) {
            out[i] = nums[i];
            out[i+nums.length] = nums[i];
        }
        return out;
    }
}
