package oop.notes3;

public class Shapes {
    // polymorphism notes


    int num = 10;
    void area(){
        System.out.println("This is a shape.");
    }

    @Override
    public String toString() {
        return "Shapes{" + num + "}.";
    }
}
