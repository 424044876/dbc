package com.fang;

public class Person {
    private String name;
    private String sex;
    private double height;
    private double weight;
    private double BMI;
    public Person(){}

    public Person(String n, String s, double h, double w){
        name=n;
        sex=s;
        height=h;
        weight=w;
        eval_BMI();
    }

    private void eval_BMI(){
        BMI = weight/(height*height);
    }

    public double getBMI(){
        return BMI;
    }
}
