package com.fang;

public class Main {

    public static void main(String[] args) {
        //test BMI
        Person dbc=new Person("dbc", "male", 1.8, 100);
        System.out.println(dbc.getBMI());
    }
}
