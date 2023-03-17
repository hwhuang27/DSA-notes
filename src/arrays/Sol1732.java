package arrays;

import java.util.ArrayList;

public class Sol1732 {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int ans = largestAltitude(gain);
        System.out.println(ans);
    }

    public static int largestAltitude(int[] gain) {
        int highest = 0;
        int curr = 0;
        ArrayList<Integer> altitudes = new ArrayList<>();
        altitudes.add(0);

        for (int j : gain) {
            curr = curr + j;
            altitudes.add(curr);
        }
        for (int altitude:
             altitudes) {
            if (highest < altitude){
                highest = altitude;
            }
        }

        return highest;
    }
}
