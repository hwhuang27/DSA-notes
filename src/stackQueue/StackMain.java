package stackQueue;

public class StackMain {
    public static void main(String[] args) throws StackException {
        // CustomStack stack = new CustomStack(5);
        // DynamicStack stack = new DynamicStack(5);
        CustomStack stack = new DynamicStack(5);    // only able to access variables from CustomStack (parent)
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(stack);
    }
}
