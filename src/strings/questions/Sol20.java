package strings.questions;

import java.util.Stack;

public class Sol20 {
    public static void main(String[] args) {
        String s = "()[]{}";
        String s2 = ")(){}";

        System.out.println(isValid(s));
        System.out.println(isValid(s2));
    }
    public static boolean isValid(String s) {
        if(s.length() == 1){
            return false;
        }
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (Character c : chars) {
            switch(c){
                case '(', '{', '[' -> stack.add(c);
                case ')' -> {
                    if(stack.isEmpty()){
                        return false;
                    }
                    if(stack.pop() != '('){
                        return false;
                    }
                }
                case '}' -> {
                    if(stack.isEmpty()){
                        return false;
                    }
                    if(stack.pop() != '{'){
                        return false;
                    }
                }
                case ']' -> {
                    if(stack.isEmpty()){
                        return false;
                    }
                    if(stack.pop() != '['){
                        return false;
                    }
                }
            }
        }

        if (stack.isEmpty()){
            return true;
        }
        return false;
    }
}
