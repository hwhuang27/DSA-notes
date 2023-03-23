package oop.notes5.extendDemo2;

public class Main implements A, B {
    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();   // called using interface name
        obj.wave();
        obj.point();

    }

    @Override
    public void point() {
        System.out.println("pointing");
    }
}
