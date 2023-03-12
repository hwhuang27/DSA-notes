package Arrays_Questions;

import java.util.Arrays;

public class Sol1480 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr2 = {1,1,1,1,1};
        int[] arr3 = {3,1,2,10,1};

        int[] ans = runningSum(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] runningSum(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            count = count + nums[i];
            nums[i] = count;
        }

        return nums;
    }
}
