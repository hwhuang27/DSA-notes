package searching.questions;

public class Sol441 {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(arrangeCoins(n));
    }
    public static int arrangeCoins(int n) {
        long total = 0;
        int add = 1;
        while(total < n){
            total = total + add;
            if (total == n){
                return add;
            }
            add++;
        }
        return add-2;
    }
}
