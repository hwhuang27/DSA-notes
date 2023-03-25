package oop.notes6;

import java.util.Arrays;

public class CustomGenArrayList<T> {

    private Object[] data;
    private final static int DEFAULT_VALUE = 10;

    private int size = 0;

    // don't forget to make constructor!
    public CustomGenArrayList(){

        data = new Object[DEFAULT_VALUE];
    }

    public void add(T num){
        if(this.isFull()){
            this.resize();
        }

        data[size++] = num;
    }

    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public Object get(int index){
        return data[index];
    }

    public void set(int index, T num){
        data[index] = num;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return data.length == 0;
    }

    public Object remove(){

        return data[--size];
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        //ArrayList<Integer> list = new ArrayList<>();
        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(i*2);
        }

        System.out.println(list);
    }


}
