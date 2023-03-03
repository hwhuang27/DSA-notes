package Arrays;
import java.util.Arrays;

public class Sol1470 {
    public static void main(String[] args) {
        int[] arr1 = {2,5,1,3,4,7};
        //int[] arr2 = {1,2,3,4,4,3,2,1};
        int n = 3;
        int[] ans = shuffle(arr1, n);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < n; i++) {
            ans[i*2] = nums[i];
            ans[i*2+1] = nums[n+i];
        }
        return ans;
    }
}
