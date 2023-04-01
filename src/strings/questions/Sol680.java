package strings.questions;

public class Sol680 {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(validPalindrome(s));
    }

    public static boolean validPalindrome(String s) {
        char[] str = s.toCharArray();
        int start = 0;
        int end = str.length-1;
        boolean isValid = false;
        boolean deleted = false;
        // case 1: its start/end is the same, move ptrs up
        // case 2: it's different, deleted -> true, move ptrs up
        // case 3: it's different, deleted == true, return false
        while (start < end){
            if(deleted == false){
                if (str[start] != str[end]) {
                    deleted = true;
                }
                start++;
                end--;
            }
            else{
                if(str[start] == str[end]){
                    start++;
                    end--;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
