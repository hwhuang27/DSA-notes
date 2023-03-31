package strings.questions;

public class Sol1678 {
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        System.out.println(interpret(command));
    }

    public static String interpret(String command) {
        // scan through command string, insert in new StringBuilder
        StringBuilder ans = new StringBuilder();
        char[] cmd = command.toCharArray();
        for (int i = 0; i < cmd.length; i++) {
            if(cmd[i] == 'G'){
                ans.append('G');
            }
            if(cmd[i] == '(' && cmd[i+1] == ')'){
                ans.append('o');
                i = i + 1;
            }
            if(cmd[i] == '(' && cmd[i+1] == 'a'){
                ans.append('a');
                ans.append('l');
                i = i + 3;
            }
        }

        return ans.toString();
    }

}
