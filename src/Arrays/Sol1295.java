package Arrays;

public class Sol1295 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }

    public static int findNumbers(int[] nums) {
        int evens = 0;
        for (int n: nums) {
            int count = 0;
            while(n > 0){
                n = n/10;
                count++;
            }
            if (count%2 == 0){
                evens++;
            }
        }
        return evens;
    }
}
