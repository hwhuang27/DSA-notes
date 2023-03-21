package oop.notes;
import oop.notes.Singleton;

public class Notes1 {
    public static void main(String[] args) {
        Student david = new Student(1,"David", 87.6f);
        david.greeting();
        Student test = new Student();
        test.greeting();

        final int INCREASE = 2;     // final variable, unmodifiable, all caps convention
        System.out.println(INCREASE);

        Integer a = 10;
        Integer b = 20;
        swap(a,b);

        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();


    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}





