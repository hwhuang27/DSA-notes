package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Sol1389 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] ans = createTargetArray(nums, index);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target = new ArrayList<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            target.add(index[i], nums[i]);
        }

        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            ans[i] = target.get(i);
        }
        return ans;
    }
}
