package com.fang;

public class Shape {
    protected double length_of_Side;
    protected double proportion;

    public Shape() {}

    public Shape(double l, double p){
        length_of_Side = l;
        proportion = p;
    }

    public double getLength_of_Side(){
        return length_of_Side;
    }

    public double getProportion(){
        return proportion;
    }
}
