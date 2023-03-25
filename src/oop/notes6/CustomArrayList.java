package oop.notes6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_VALUE = 10;

    private int size = 0;

    // don't forget to make constructor!
    public CustomArrayList(){
        data = new int[DEFAULT_VALUE];
    }

    public void add(int num){
        if(this.isFull()){
            this.resize();
        }

        data[size++] = num;
    }

    private boolean isFull(){
        return size == data.length;
    }

    private void resize(){
        int[] temp = new int[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    public int get(int index){
        return data[index];
    }

    public void set(int index, int num){
        data[index] = num;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return data.length == 0;
    }

    public int remove(){
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
        CustomArrayList list = new CustomArrayList();
        for (int i = 0; i < 15; i++) {
            list.add(i*2);
        }

        System.out.println(list);
    }


}
