package Searching_Notes;

public class Sol33 {
    public static void main(String[] args) {
        //int[] nums = {4,5,6,7,0,1,2};
        int[] nums = {2,9,2,2,2};
        int target = 6;
        //System.out.println(search(nums,target));
        System.out.println(findPivot(nums));
    }

    public static int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while (start <= end){
            int mid = start + (end-start)/2;  // middle index

            // case 1 - find pivot
            if (mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            // case 2 - find pivot
            if (mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            }

            // case 3 & 4 - shorten search range
            if (nums[start] > nums[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1){
            return binarySearch(nums,target, 0, nums.length-1);
        }
        if (nums[pivot] == target){
            return pivot;
        }
        if (target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }

        return binarySearch(nums, target, pivot+1, nums.length-1);
    }

    public static int binarySearch(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + ((end-start)/2);
            if(target > nums[mid]){
                start = mid+1;
            }
            else if(target < nums[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
