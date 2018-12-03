package com.fang;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle() {}

    public Rectangle(int l, int w) {
        length = l;
        width = w;
        eval_length_of_Side();
        eval_proportion();
    }

    private void eval_length_of_Side(){
        length_of_Side = 2*length+2*width;
    }

    private void eval_proportion(){
        proportion = length*width;
    }
}
