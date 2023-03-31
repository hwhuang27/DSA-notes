package strings.questions;

public class Sol1309 {
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));

    }

    public static String freqAlphabets(String s) {
        // make alphabet character array
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) (i + 'a');
        }

        // make the string
        StringBuilder ans = new StringBuilder();
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if(i+2 < str.length && str[i+2] == '#'){
                int value = Integer.parseInt(s.substring(i, i+2));
                ans.append(alphabet[value-1]);
                i += 2;
            }
            else{
                int value = Integer.parseInt(str[i]+"");
                ans.append(alphabet[value-1]);
            }
        }

        return ans.toString().trim();
    }

}
