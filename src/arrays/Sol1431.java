package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sol1431 {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        List<Boolean> ans;
        ans = kidsWithCandies(candies, extraCandies);
        System.out.println(Arrays.toString(ans.toArray()));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = 0;
        int curr;

        // find maximum candies among children
        for (int kid:
             candies) {
            if (max < kid){
                max = kid;
            }
        }

        // check greatest amount of candies among children
        for (int i = 0; i < candies.length; i++) {
            curr = candies[i] + extraCandies;
            if (curr >= max){
                ans.add(i,true);
            }
            else{
                ans.add(i,false);
            }
        }

        return ans;
    }
}
