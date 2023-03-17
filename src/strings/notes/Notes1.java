package strings.notes;

public class Notes1 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
        builder.deleteCharAt(0);
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);

        String str = "racecar";
        System.out.println(isPalindrome(str));

    }
    public static boolean isPalindrome(String str){
        if (str == null || str.length() == 0){
            return true;
        }
        int start = 0;
        int end = str.length()-1;
        while(start <= end){
            char s = str.charAt(start);
            char e = str.charAt(end);
            if(s != e){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }



}
