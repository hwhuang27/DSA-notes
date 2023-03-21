package oop.notes;

public class StaticBlock {
    static int a = 4;
    static int b;

    // this will only run once, when the first object is created i.e. when this class is loaded for the first time
    static {
        System.out.println("Stack block loaded.");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);


    }
}

