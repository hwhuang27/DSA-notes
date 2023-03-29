package stackQueue;

import java.util.Arrays;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;   // pointer for the end (last) element
    protected int front = 0;
    private int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE); // this just calls the below constructor with DEFAULT_SIZE value
        // new CustomStack(DEFAULT_SIZE);
    }
    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;    // ptr is at last index
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int item){
        // check isFull by calling another method
        if(isFull()){
            System.out.println("Queue is full.");
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot remove from empty queue.");
        }
        int item = data[front++];
        front = front % data.length;
        size--;
        return item;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot remove from empty queue.");
        }
        return data[front];
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Queue is empty.");
        }

        int tempFront = front;
        int tempEnd = end;
        do {
            System.out.print(data[tempFront] + " ");
            tempFront++;
            tempFront %= data.length;
        }
        while (tempFront != tempEnd);

            System.out.println("END");
    }

//    @Override
//    public String toString() {
//        return "CustomQueue{" +
//                "data=" + Arrays.toString(data) +
//                '}';
//    }
}
