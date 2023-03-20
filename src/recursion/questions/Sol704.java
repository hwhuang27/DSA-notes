package recursion.questions;

public class Sol704 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 3;
        System.out.println(search(arr, target, 0, arr.length-1));
    }

    public static int search(int[] nums, int target, int start, int end) {
        if(start > end){
            return -1;
        }

        int mid = start+((end-start)/2);

        if(nums[mid] == target){
            return mid;
        }
        else if (nums[mid] < target){
            return search(nums, target, mid+1, end);
        }

        // if (nums[mid] > target
        return search(nums, target, start, mid-1);
    }
}
