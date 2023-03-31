package strings.questions;

public class Sol1967 {
    public static void main(String[] args) {
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";
        System.out.println(numOfStrings(patterns, word));
    }

    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String pattern : patterns) {
            if(word.contains(pattern)){
                count++;
            }
        }
        return count;
    }
}
