package oop.notes6.comparing;

public class Student implements Comparable<Student>{
    int id;
    float marks;

    public Student(int id, float marks) {
        this.id = id;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        return (int)(this.marks - o.marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", marks=" + marks +
                '}';
    }
}
