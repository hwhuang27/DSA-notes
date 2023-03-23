package oop.notes5;

public class CDPlayer implements Media{

    @Override
    public void start() {
        System.out.println("I start media player like a normal Car.");
    }

    @Override
    public void stop() {
        System.out.println("I stop media player like a normal Car.");
    }
}
