package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sol989 {
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        List<Integer> ans = addToArrayForm(num, k);
        System.out.println(ans);
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        // doesn't work because "long" datatype cannot hold number
        // add digits from the right side if you ever come back to this Q
        List<Integer> out = new ArrayList<>();
        int len = num.length;
        int dcr = num.length-1;
        long sum = 0;
        for (int j : num) {
            long tens = (long) Math.pow(10, dcr);
            sum += j * tens;
            dcr--;
        }
        sum += k;

        while (sum > 0){
            long digit = sum%10;
            sum = sum/10;
            out.add((int)digit);
        }
        Collections.reverse(out);
        return out;
    }
}