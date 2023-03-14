package Searching_Notes;

public class Notes3_InfiniteBS {
    // Binary search with infinite array size
    // cannot use arr.length -> we can't use start/end
    // solution? make a start/end by searching in "chunks"
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18,21,22,23,27,34,37,44,47,48,66,67,69,88,111,123,144,155,222};
        int target = 18;

        System.out.println(infiniteBinarySearch(arr, target));
    }

    public static int infiniteBinarySearch(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(arr[end] < target){
            int temp = end+1;
            end = end + ((end-start+1)*2);
            start = temp;
        }
        System.out.println(start);
        System.out.println(end);
        return binarySearch(arr,target,start,end);
    }

    public static int binarySearch(int[] arr, int target, int start, int end){

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
