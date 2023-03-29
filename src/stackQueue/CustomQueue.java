package stackQueue;

import java.util.Arrays;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;   // pointer for the end (last) element

    public CustomQueue(){
        this(DEFAULT_SIZE); // this just calls the below constructor with DEFAULT_SIZE value
        // new CustomStack(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length;    // ptr is at last index
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int item){
        // check isFull by calling another method
        if(isFull()){
            System.out.println("Queue is full.");
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot remove from empty queue.");
        }
        int item = data[0];
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return item;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot remove from empty queue.");
        }
        return data[0];
    }

    @Override
    public String toString() {
        return "CustomQueue{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
