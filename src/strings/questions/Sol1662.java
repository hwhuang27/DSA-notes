package strings.questions;

public class Sol1662 {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder one = new StringBuilder();
        for (String s : word1) {
            one.append(s);
        }
        StringBuilder two = new StringBuilder();
        for (String s : word2) {
            two.append(s);
        }
        String s1 = one.toString();
        String s2 = two.toString();
        return s1.equalsIgnoreCase(s2);
    }
}
