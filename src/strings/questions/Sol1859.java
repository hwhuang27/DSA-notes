package strings.questions;

import java.util.HashMap;

public class Sol1859 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s) {
        String[] arr = s.split(" ");
        HashMap<Integer, String> map = new HashMap<>();
        for (String s1 : arr) {
            char[] temp = s1.toCharArray();
            int index = Character.getNumericValue(temp[temp.length-1]);
            map.put(index, s1.substring(0,s1.length()-1));
        }
        StringBuilder ans = new StringBuilder();
        for (String value : map.values()) {
            ans.append(value);
            ans.append(" ");
        }

        return ans.toString().trim();
    }
}
