package oop.notes4;

public abstract class Parent {
    int age;

    public Parent(int age) {
        this.age = age;
    }

    static void printStatic(){
        System.out.println("static");
    }
    public void printSomething(){
        System.out.println("something");
    }

    abstract void career();
    abstract void age();
}
