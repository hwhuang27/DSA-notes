package oop.notes6.comparing;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i + 1);
        }

        list.forEach((elem) -> System.out.println(elem * 2));
//        Consumer<Integer> test = (elem) -> System.out.println(elem * 2);
//        list.forEach(test);


        // Step 1: Create Interface to hold lambda functions

        // Step 2: Specify lambda functions with Interface type
        Operation sum = (a, b) -> a + b;
        Operation subtract = (a, b) -> a - b;
        Operation multiply = (a, b) -> a * b;

        // Step 3: Create new object to use "operate" method
        LambdaFunctions myCalculator = new LambdaFunctions();
        System.out.println(myCalculator.operate(5, 10, sum));
        System.out.println(myCalculator.operate(10, 5, subtract));
        System.out.println(myCalculator.operate(10, 5, multiply));


    }

    private int operate(int a, int b, Operation op){
        // Operation op is an Interface type that holds a lambda operation
        // op is a variable of type Interface
        return op.operation(a, b);
    }

    interface Operation {
        int operation(int a, int b);
    }
}
