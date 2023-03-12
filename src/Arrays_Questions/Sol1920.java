package Arrays_Questions;

import java.util.Arrays;

public class Sol1920 {
    public static void main(String[] args) {
        //int[] arr = {0,2,1,5,3,4};
        int[] arr = {5,0,1,2,3,4};
        int[] ans = buildArray(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] buildArray(int[] nums) {
        int[] out = new int[nums.length];

        for (int i = 0; i < nums.length ; i++) {
            out[i] = nums[nums[i]];
        }

        return out;
    }

}
