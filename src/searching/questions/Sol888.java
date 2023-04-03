package searching.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

public class Sol888 {
    public static void main(String[] args) {
        int[] aliceSizes = {1,1};
        int[] bobSizes = {2,2};

        System.out.println(Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int diff = (IntStream.of(aliceSizes).sum() - IntStream.of(bobSizes).sum())/2;
        HashSet<Integer> set = new HashSet<>();
        for (int candyA : aliceSizes){
            set.add(candyA);
        }
        for (int candyB : bobSizes) {
           if(set.contains(candyB + diff)){
                return new int[]{diff+candyB, candyB};
           }
        }
        return new int[0];
    }
}
