package Searching;

import java.util.Arrays;

public class Sol69 {
    public static void main(String[] args) {
        int target = 25;
        int ans = squareRoot(target);
        System.out.println(ans);
    }

    public static int squareRoot(int x) {
        int[] nums = new int[Integer.MAX_VALUE];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        System.out.println(Arrays.toString(nums));
        return -1;
    }
}
