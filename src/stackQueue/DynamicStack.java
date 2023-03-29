package stackQueue;

public class DynamicStack extends CustomStack{

    public DynamicStack(){
        super();    // calls new CustomStack();
    }

    public DynamicStack(int size){
        super(size);    // calls new CustomStack(int size);
    }

    @Override
    public boolean push(int item) {
        if(isFull()){
            // double array size
            doubleSize();
        }
        return super.push(item);
    }

    private void doubleSize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }


}
