package Arrays_Questions;

import java.util.ArrayList;
import java.util.Collections;

public class Sol1854 {
    public static void main(String[] args) {
        int[][] logs = {{1993,1999},{2000,2010}};
        int ans = maximumPopulation(logs);
        System.out.println(ans);
    }

    public static int maximumPopulation(int[][] logs) {
        int start, end;
        ArrayList<Integer> pop = new ArrayList<>();
        for (int i = 1950; i < 2501; i++) {
            int currPop = 0;
            for (int[] person: logs) {
                start = person[0];
                end = person[1];
                if (start <= i && i < end){
                    currPop++;
                }
            }
            pop.add(currPop);
        }
        int max = Collections.max(pop);
        for (int i = 0; i < pop.size(); i++) {
            if (pop.get(i) == max){
                return 1950+i;
            }
        }
        return 1950;
    }
}
