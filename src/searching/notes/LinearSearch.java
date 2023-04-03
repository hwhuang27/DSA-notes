package searching.notes;

public class LinearSearch {
    // linear search notes
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 3;
        int ans = linearSearch(arr, target);
        if (ans == -1){
            System.out.println("Number " + target + " not found in array");
        }
        else{
            System.out.println("Number " + target + " found at index " + ans);
        }
        // search 2-d array
        // return new int[] {row, col};

        // shortcut to finding # digits in Integer
        // return (int)(Math.log10(num)) + 1;
    }

    public static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target){
                return i;
            }
        }
        return -1;
    }
}
