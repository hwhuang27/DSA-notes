package searching.notes;

public class Sol81 {
    public static void main(String[] args) {
        // hints used
        //int[] nums1 = {4,4,4,4,4,4,4,5,7,0,2,4,4};
        int[] nums = {2,9,2,2,2};
        int target = 0;
        System.out.println(findPivot(nums));
        System.out.println(search(nums,target));
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

            // case 3 - if mid, start, & end are equal (for duplicate value arrays)
            // then shrink array by moving start + 1 and end - 1 until above is false
            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                // check if start is pivot
                if(nums[start] > nums[start+1]){
                    return start;
                }
                start++;
                // check if end is pivot
                if(nums[end] < nums[end-1]){
                    return end-1;
                }
                end--;
            }
            // solve for new shrunk array
            else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1){
            return binarySearch(nums, target, 0, nums.length - 1) > -1;
        }
        if (nums[pivot] == target){
            return true;
        }
        if (target > nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1) > -1;
        }
        else if (target < nums[0]){
            return binarySearch(nums, target, pivot+1, nums.length-1) > -1;
        }
        else{
            return true;
        }

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
