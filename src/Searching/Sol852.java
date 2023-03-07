package Searching;

public class Sol852 {
    public static void main(String[] args) {
        int[] arr = {3,5,4,3,2,0};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + ((end-start)/2);  // middle index
            if (mid == 0){
                return 1;
            }
            else if (mid == arr.length-1){
                return arr.length-1;
            }

            if (arr[mid-1] < arr[mid] && arr[mid+1] < arr[mid]){
                return mid;
            }
            else if (arr[mid-1] < arr[mid] && arr[mid+1] > arr[mid]){
                start = mid+1;
            }
            else if (arr[mid-1] > arr[mid] && arr[mid+1] < arr[mid]){
                end = mid-1;
            }
        }
        return -1;
    }
}
