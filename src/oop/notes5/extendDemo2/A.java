package oop.notes5.extendDemo2;

public interface A {
    // static interface methods should ALWAYS have a body
    // why? because static methods cannot be overridden

    static void greeting(){
        System.out.println("Greetings!");
    }

    default void wave(){
        System.out.println("I am in A");
    }
}
