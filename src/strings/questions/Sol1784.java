package strings.questions;

public class Sol1784 {
    public static void main(String[] args) {
        String s = "110";
        System.out.println(checkOnesSegment(s));
    }

    public static boolean checkOnesSegment(String s) {
        if(s.length() == 1){
            return true;
        }
        char[] chars = s.toCharArray();
        boolean endOfSegment = false;

        for (char c : chars) {
            if (c == '0' && !endOfSegment){
                endOfSegment = true;
            }
            else if (c == '1' && endOfSegment){
                return false;
            }
        }
        return true;
    }
}
