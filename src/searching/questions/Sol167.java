package searching.questions;

import java.util.Arrays;

public class Sol167 {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] ans = twoSum(numbers, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        //int[] ans = new int[2];

        while (start <= end){
            if(numbers[start] + numbers[end] > target){
                end--;
            }
            else if (numbers[start] + numbers[end] < target){
                start++;
            }
            else{
                return new int[] {start+1, end+1};
            }
        }

        return new int[] {-1,-1};
    }
}
