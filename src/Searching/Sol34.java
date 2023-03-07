package Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sol34 {
    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,8,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(nums, target)));

    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = search(nums, target, true);
        ans[1] = search(nums,target, false);
        return ans;
    }

    public static int search(int[] nums, int target, boolean isFirstIndex) {
        int start = 0;
        int end = nums.length-1;
        int index = 0;

        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                index = mid;
                if(isFirstIndex){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }

        return index;
    }



    public static int[] searchRange2(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int first = -1;
        int last = -1;
        // find first occurrence
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
                first = mid;
            }
        }

        start = 0;
        end = nums.length-1;
        // find last occurrence
        while (start <= end){
            int mid = start + ((end-start)/2);
            if(target < nums[mid]){
                end = mid-1;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                start = mid+1;
                last = mid;
            }
        }
        return new int[] {first,last};
    }
    public static int[] searchRange3(int[] nums, int target) {
        ArrayList<Integer> out = new ArrayList<>();
        int start = 0;
        int end = nums.length-1;

        // find first occurrence
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
                out.add(mid);
            }
        }

        start = 0;
        end = nums.length-1;
        // find last occurrence
        while (start <= end){
            int mid = start + ((end-start)/2);
            if(target < nums[mid]){
                end = mid-1;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                start = mid+1;
                out.add(mid);
            }
        }

        if(!out.isEmpty()){
            return new int[] {Collections.min(out), Collections.max(out)};
        }
        return new int[] {-1,-1};
    }
}
