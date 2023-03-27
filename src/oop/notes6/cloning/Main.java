package oop.notes6.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human david = new Human(24, "David");

        //Human twin = new Human(david);
        // this uses a lot of processing power
        // don't need to add extra overhead with "new" keyword

        // instead we can use the clone method in Object class
        Human twin = (Human) david.clone();
        System.out.println(twin.age);
        System.out.println(twin.name);
        System.out.println(Arrays.toString(twin.arr));
        david.arr[0] = 123;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(david.arr));
    }
}
