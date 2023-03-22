package oop.notes2;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);         // calls the parent class constructor
        // used to initialize values present in parent class
        this.weight = weight;   // initialize weight in this class
    }

}
