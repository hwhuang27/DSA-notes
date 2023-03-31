package strings.questions;

public class Sol1704 {
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));
    }
    public static boolean halvesAreAlike(String s) {
        StringBuilder str = new StringBuilder(s);
        String left = str.substring(0,(str.length()/2));
        String right = str.substring((str.length()/2), str.length());
        int leftCount = 0;
        int rightCount = 0;
        for (char c : left.toCharArray()) {
            switch(c) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                    leftCount++;
            }
        }
        for (char c : right.toCharArray()) {
            switch(c) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                    rightCount++;
            }
        }

        return leftCount == rightCount;
    }
}
