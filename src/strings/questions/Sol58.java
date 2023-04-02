package strings.questions;

public class Sol58 {
    public static void main(String[] args) {
        String s = "a";
        String s1 = "   fly me   to   the moon  ";
        String s2 = "      day";
        System.out.println(lengthOfLastWord(s));
        System.out.println(lengthOfLastWord(s1));
        System.out.println(lengthOfLastWord(s2));
    }

    public static int lengthOfLastWord(String s) {
        StringBuilder builder = new StringBuilder(s.trim());
        builder = builder.reverse();
        int ans = 0;
        for (int i = 0; i < builder.length(); i++) {
            if(builder.charAt(i) == ' '){
                ans = i;
                break;
            }
            else if (i == builder.length()-1){
                ans = i+1;
                break;
            }

        }
        return ans;
    }
}
