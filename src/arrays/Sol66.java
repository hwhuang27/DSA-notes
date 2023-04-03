package arrays;

import java.util.Arrays;

public class Sol66 {
    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            builder.append(digits[i]);
        }
        long num = Long.parseLong(builder.toString());
        num++;
        String temp = Long.toString(num);
        char[] chars = temp.toCharArray();
        int[] ans = new int[chars.length];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = Character.getNumericValue(chars[i]);
        }
        return ans;
    }
}
