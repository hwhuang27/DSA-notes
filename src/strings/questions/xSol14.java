package strings.questions;

public class xSol14 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        char[][] chars = new char[strs.length][];
        for (int i = 0; i < strs.length; i++) {
            chars[i] = strs[i].toCharArray();
        }

        for (int i = 0; i < chars.length; i++) {
            sort(chars[i]);
        }

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                System.out.print(chars[i][j]);
            }
            System.out.println("");
        }

        return " ";
    }


    public static void sort(char[] arr){
        // insertion sort
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    public static void swap(char[] arr, int first, int second){
        char temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
