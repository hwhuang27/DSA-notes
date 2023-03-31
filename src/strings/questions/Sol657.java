package strings.questions;

public class Sol657 {
    public static void main(String[] args) {
        String moves = "LL";
        System.out.println(judgeCircle(moves));
    }
    public static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        char[] temp = moves.toCharArray();
        for (char c : temp) {
            switch(c){
                case 'U' -> y++;
                case 'D' -> y--;
                case 'R' -> x++;
                case 'L' -> x--;
            }
        }
        return (x == 0 && y == 0);
    }

}
