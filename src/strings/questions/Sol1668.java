package strings.questions;

import java.util.ArrayList;

public class Sol1668 {
    public static void main(String[] args) {
        String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String word = "aaaba";
        System.out.println(maxRepeating(sequence, word));

    }

    public static int maxRepeating(String sequence, String word) {
        if(word.length() > sequence.length()){
            return 0;
        }
        if(sequence.indexOf(word) == -1){
            return 0;
        }
        if(sequence.indexOf(word) == sequence.lastIndexOf(word)){
            return 1;
        }
        StringBuilder builder = new StringBuilder("");
        int ans = 0;

        while(builder.length() < sequence.length()){
            builder.append(word);
            if(sequence.contains(builder)) {
                ans++;
            }
        }
        return ans;
    }
}
