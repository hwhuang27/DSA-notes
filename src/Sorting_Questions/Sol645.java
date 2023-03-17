package Sorting_Questions;

import java.util.Arrays;

public class Sol645 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int[] ans = findErrorNums(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        int[] ans = new int[2];
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }
        i = 0;
        while(nums[i]-1 == i){
            i++;
        }
        ans[0] = nums[i];
        ans[1] = i+1;
        return ans;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
