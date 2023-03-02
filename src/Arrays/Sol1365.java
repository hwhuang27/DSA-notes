package Arrays;

import java.util.Arrays;

public class Sol1365 {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        int[] ans = smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] out = new int[len];
        int smaller = 0;
        for (int i = 0; i < len; i++) {

            for (int num : nums) {
                if (nums[i] > num) {
                    smaller++;
                }
            }
            out[i] = smaller;
            smaller = 0;
        }
        return out;
    }
}
