package sorting.questions;

import java.util.Arrays;

public class Sol268 {
    public static void main(String[] args) {
        int[] nums = {0,1};
        int ans = missingNumber(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(ans);
    }
    public static int missingNumber(int[] nums) {
        int i = 0;
        int n = nums.length;
        while( i < nums.length){
            int correct = i;
            if(nums[i] == n){
                i++;
                continue;
            }
            if(nums[i] != correct){
                swap(nums, i, nums[correct]);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] == n){
                return j;
            }
        }
        return nums.length;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
