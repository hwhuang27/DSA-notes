package stackQueue;

public class DynamicQueue extends CircularQueue{

    public DynamicQueue(){
        super();    // calls new CircularQueue();
    }

    public DynamicQueue(int size){
        super(size);    // calls new CircularQueue(int size);
    }

    @Override
    public boolean insert(int item) {
        if(isFull()){
            // double array size
            doubleSize();
        }
        return super.insert(item);
    }

/*    private void doubleSizeMyMethod() {
        int[] temp = new int[data.length * 2];
        int tempFront = front;
        int tempEnd = end;
        int i = 0;
        do {
            temp[i++] = data[tempFront];
            tempFront++;
            tempFront %= data.length;
        }
        while (tempFront != tempEnd);

        front = 0;
        end = i;
        data = temp;
    }*/

    private void doubleSize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[(i+front) % data.length];
        }
        front = 0;
        end = data.length;
        data = temp;
    }

}
