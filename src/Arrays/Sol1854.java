package Arrays;

public class Sol1854 {
    public static void main(String[] args) {
        int[][] logs = {{1993,1999},{2000,2010}};
        int ans = maximumPopulation(logs);
        System.out.println(ans);
    }

    public static int maximumPopulation(int[][] logs) {
        int currPop = 0;
        int[] pop = new int[100];
        for (int i = 1950; i < 2501; i++) {
            for (int[] person: logs) {
            }
            pop[i-1950] = currPop;
        }
        return 0;
    }
}
