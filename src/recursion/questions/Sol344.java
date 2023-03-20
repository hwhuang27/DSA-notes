package recursion.questions;

public class Sol344 {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        char[] ans = reverseString(s, 0, s.length-1);
        System.out.println(ans);
    }
    public static char[] reverseString(char[] s, int start, int end) {
        if (start > end){
            return s;
        }
        swap(s, start, end);
        return reverseString(s, start+1, end-1);
    }

    public static void swap(char[] s, int first, int second){
        char temp = s[first];
        s[first] = s[second];
        s[second] = temp;
    }
}
