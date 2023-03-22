package oop.notes2;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(3.0, 4.0, 5.0);
        Box box2 = new Box(box);
        box.info();
        box2.info();

        BoxWeight box3 = new BoxWeight(1, 2, 3, 8);
        BoxWeight box4 = new BoxWeight();
        System.out.println(box3.l + " " + box3.w + " " + box3.h + " " + box3.weight + " ");

        Box box5 = new BoxWeight(2, 3, 4, 8);

    }
}
