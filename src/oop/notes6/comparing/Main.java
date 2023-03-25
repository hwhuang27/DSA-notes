package oop.notes6.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student david = new Student(1, 11.1f);
        Student one = new Student(2, 22.2f);
        Student two = new Student(3, 33.3f);
        Student three = new Student(4, 44.4f);
        Student four = new Student(5, 55.5f);

        Student[] list = {david, one, two, three, four};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks));
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return -(int)(o1.marks - o2.marks);
//            }
//        });
        System.out.println(Arrays.toString(list));

    }
}
