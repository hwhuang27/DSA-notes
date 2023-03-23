package oop.notes4;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career(){
        System.out.println("I am nurse.");
    }

    @Override
    void age() {
        System.out.println("My age is " + super.age);
    }
}
