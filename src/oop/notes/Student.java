package oop.notes;

class Student{
    int studentNum;
    String name;
    float marks;

    Student(){
        // call a constructor from another constructor
        // internally calls: new Student (0, "default person", 0.0f);
        this(0, "default person", 0.0f);
    }
    Student(int studentNum, String name, float marks){
        // constructor
        this.studentNum = studentNum;
        this.name = name;
        this.marks = marks;
    }

    void greeting(){
        System.out.println("Hello my name is " + this.name);
    }
}