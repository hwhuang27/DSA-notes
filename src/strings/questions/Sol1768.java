package strings.questions;

public class Sol1768 {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        StringBuilder ans = new StringBuilder(word1.length() + word2.length());
        int i = 0;
        int j = 0;
        int max = Math.max(word1.length(), word2.length());

        for (int k = 0; k < max; k++) {
            if(i < word1.length()){
                ans.append(chars1[i]);
                i++;
            }
            if(j < word2.length()){
                ans.append(chars2[j]);
                j++;
            }
        }

        return ans.toString();
    }
}
