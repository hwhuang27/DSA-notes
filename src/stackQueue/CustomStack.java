package stackQueue;

import java.util.Arrays;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE); // this just calls the below constructor with DEFAULT_SIZE value
        // new CustomStack(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        // check isFull by calling another method
        if(isFull()){
            System.out.println("Stack is full.");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from empty stack.");
        }
        return data[ptr--];
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from empty stack.");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length-1;    // ptr is at last index
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

    @Override
    public String toString() {
        return "CustomStack{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
