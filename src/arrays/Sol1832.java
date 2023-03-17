package arrays;

public class Sol1832 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        //sentence = "leetcode";
        boolean ans = checkIfPangram(sentence);
        System.out.println(ans);
    }

    public static boolean checkIfPangram(String sentence) {
        char[] alphabet = {'a','b','c','d','e','f','g','h','i',
                'j','k','l','m','n','o','p','q','r','s','t','u','v',
                'w','x','y','z'};
        for (char c:
                alphabet) {
            if (sentence.indexOf(c) == -1){
                return false;
            }
        }
        return true;
    }
}
