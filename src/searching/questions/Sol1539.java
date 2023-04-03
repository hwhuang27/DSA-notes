package searching.questions;

public class Sol1539 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,11};
        int[] arr2 = {1,2,3,4,5};
        int k = 1;
        System.out.println(findKthPositive(arr2, k));
    }

    public static int findKthPositive(int[] arr, int k) {
        if(arr.length == 1 && arr[0] != 1){
            return 1;
        }
        int start = 0;
        int end = arr.length;

        while (start < end){
            int mid = start + ((end-start)/2);

            if(arr[mid] - mid > k){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start + k;
    }
}
