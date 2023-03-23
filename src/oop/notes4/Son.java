package oop.notes4;

public class Son extends Parent{

    public Son(int age) {
        super(age);
    }
    @Override
    public void printSomething(){
        super.printSomething();
    }

    @Override
    void career(){
        System.out.println("I am doctor.");
    }

    @Override
    void age() {
        System.out.println("My age is " + super.age);
    }
}
