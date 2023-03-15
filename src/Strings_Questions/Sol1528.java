package Strings_Questions;

import java.util.Arrays;

public class Sol1528 {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String ans = restoreString(s, indices);
        System.out.println(ans);
        System.out.println(Arrays.toString(indices));

    }

    public static String restoreString(String s, int[] indices) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(indices[j] < indices[j-1]) {
                    swap(indices, j, j-1);
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
        return new String(arr);
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void swap(char[] arr, int first, int second){
        char temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
