package strings.questions;

public class Sol2000 {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));

    }

    public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if(index == -1){
            return word;
        }
        StringBuilder chars = new StringBuilder(word);
        System.out.println(chars);
        String first = chars.substring(0, index+1);
        String second = chars.substring(index+1);
        StringBuilder ans = new StringBuilder(first);
        ans = ans.reverse();
        ans.append(second);

        return ans.toString();
    }
}
