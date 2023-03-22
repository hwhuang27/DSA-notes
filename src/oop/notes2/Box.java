package oop.notes2;

public class Box {
    double l;
    double w;
    double h;

    Box(){
        // default constructor
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }
    Box(double side){
        // create cube
        this.l = side;
        this.w = side;
        this.h = side;
    }
    Box (double l, double w, double h){
        // create normal box
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box (Box old){
        // copy from another Box
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    public void info(){
        System.out.println("running box");
        System.out.println(this.l + " x " + this.w + " x " + this.h + " sized box.");
    }
}
