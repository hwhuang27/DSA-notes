package strings.questions;

public class Sol28 {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()){
            return -1;
        }
        if(haystack.equals(needle)){
            return 0;
        }

        char[] hay = haystack.toCharArray();
        char[] need = needle.toCharArray();

        for (int i = 0; i < hay.length; i++) {
            if(hay[i] == need[0] && i+need.length <= hay.length){
                int count = 0;
                for (int j = 1; j < need.length; j++) {
                    if(hay[i+j] == need[j]){
                        count++;
                    }
                    else{
                        break;
                    }
                }
                if(count == need.length-1){
                    return i;
                }
            }
        }
        return -1;
    }
}
