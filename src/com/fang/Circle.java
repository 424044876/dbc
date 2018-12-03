package com.fang;

public class Circle extends Shape{
    private double radius;

    public Circle() {}

    public Circle(double r){
        radius=r;
        eval_length_of_Side();
        eval_proportion();
    }

    private void eval_length_of_Side(){
        length_of_Side = Math.PI*2*radius;
    }

    private void eval_proportion(){
        proportion = Math.PI*radius*radius;
    }

    public double getRadius(){
        return radius;
    }
}
