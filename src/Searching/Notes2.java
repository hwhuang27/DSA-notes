package Searching;

public class Notes2 {
    // binary search notes
    public static void main(String[] args) {
        // note: array should be sorted before using binary search
        int[] arr = {2,3,5,9,14,16,17,18,21};
        int[] arr2 = {22,21,17,15,12,11,8,6,4,2,1};
        int target = 17;

        System.out.println(orderAgnosticBS(arr,target,true));
        System.out.println(orderAgnosticBS(arr2, target,false));
    }
    public static int orderAgnosticBS(int[] arr, int target, boolean isAscending){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + ((end-start)/2);

            if(arr[mid] < target){
                if(isAscending){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else if(arr[mid] > target){
                if(isAscending){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                return mid;
            }
        }
        return -1;
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
    public static int findFloor(int[] arr, int target){
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
        return end;

    }
    public static int findCeiling(int[] arr, int target){
        if(target > arr[arr.length-1]){
            return -1;
        }

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
        return start;

    }


}
