package Searching;

public class Notes2 {
    // binary search notes
    public static void main(String[] args) {
        // note: array should be sorted before using binary search
        int[] arr = {2,3,5,9,14,16,18};
        int target = 17;
        int ans = findCeiling(arr,target);
        System.out.println(ans);
    }

    public static int findCeiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + ((end-start)/2);
            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return arr[start];

    }
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + ((end-start)/2);  // middle index
            if (target < arr[mid]){
                end = mid-1;
            }
            else if (target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        // element not found in array
        return -1;
    }

}
