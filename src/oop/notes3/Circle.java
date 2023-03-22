package oop.notes3;

public class Circle extends Shapes{

    @Override   // called annotation, signifies that this will override parent method
    void area(){
        System.out.println("This is a circle.");
    }

}
