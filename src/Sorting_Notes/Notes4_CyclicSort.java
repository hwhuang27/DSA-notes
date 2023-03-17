package Sorting_Notes;

import java.util.Arrays;

public class Notes4_CyclicSort {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        cyclicSort(arr);
        cyclicSort2(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void cyclicSort(int[] arr){
        int i = 0;
        while( i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }
    static void cyclicSort2(int[] arr) {
        int i = 0;
        while(arr[i] != i+1){
            swap(arr, i, arr[i]-1);
            if(arr[i] == i+1){
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
