package recursion.notes;

public class Notes1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 1;
        int ans = binarySearch(arr, target, 0, arr.length-1);
        System.out.println(ans);
        System.out.println(fibonacci(11));
        print(1);
    }

    public static int binarySearch(int[] arr, int target, int start, int end){
        if (start > end){
            return -1;
        }
        int mid = start+((end-start)/2);

        if(arr[mid] < target){
            return binarySearch(arr, target, mid+1, end);
        }
        else if(arr[mid] > target){
            return binarySearch(arr, target, start, mid-1);
        }
        else{
            return mid;
        }

    }
    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void print(int n){
        if(n == 9){
            System.out.println(n);
            return;
        }
        System.out.print(n);
        print(n+1);

    }
}
