package oop.notes3;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();

        shape.area();
        circle.area();
        square.area();

        System.out.println(shape);

    }
}
