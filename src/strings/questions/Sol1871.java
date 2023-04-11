package strings.questions;

public class Sol1871 {
    public static void main(String[] args) {
        String s = "0000100";
        int minJump = 2;
        int maxJump = 3;

        System.out.println(canReach(s, minJump, maxJump));
    }

    public static boolean canReach(String s, int minJump, int maxJump) {
        if (s.charAt(s.length()-1) == '1'){
            return false;
        }

        StringBuilder builder = new StringBuilder(s);
        int i = 0;

        int minDist = i + minJump;
        int maxDist = Math.min(i + maxJump, s.length()-1);

        while(i != s.length()-1){
        }

        return true;
    }
}
