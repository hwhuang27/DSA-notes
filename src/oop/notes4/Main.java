package oop.notes4;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(20);
        Parent daughter = new Daughter(18);

        son.career();
        son.age();
        daughter.career();
        daughter.age();

        Parent.printStatic();
        son.printSomething();

    }
}
