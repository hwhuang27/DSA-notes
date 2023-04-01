package sorting.notes;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] arr2 = {5,4,3,2,1};
        selectionSort(arr);
        selectionSort2(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }

    static void selectionSort2(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxIndex = findMaxIndex(arr, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int maxIndex, int last) {
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = temp;
    }

    static int findMaxIndex(int[] arr, int last) {
        int max = 0;
        for (int i = 0; i <= last; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }

        }
        return max;
    }


    static void selectionSort(int[] arr){
        int index = 0;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j <= len-i-1; j++) {
                if(arr[j] > max){
                    max = arr[j];
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[len-i-1];
            arr[len-i-1] = temp;
        }
    }
}


