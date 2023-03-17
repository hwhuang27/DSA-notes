package searching.notes;

public class Sol852 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,5,4,3,2,1};
        int ans = peakIndexInMountainArray(arr);
        int ans2 = peakIndexInMountainArray2(arr);
        System.out.println(ans);
        System.out.println(ans2);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            int mid = start + ((end-start)/2);  // middle index
             if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
     }
        return end;
    }

    public static int peakIndexInMountainArray2(int[] arr) {
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
