package com.fang;

public class Main {

    public static void main(String[] args) {
//        //test BMI
//        Person dbc=new Person("dbc", "male", 1.8, 100);
//        System.out.println(dbc.getBMI());
//        //test shape
//        Circle  c = new Circle(2);
//        System.out.println("Length of Side: "+c.getLength_of_Side()+" Proportion: "+c.getProportion());
//        Rectangle r = new Rectangle(3, 4);
//        System.out.println("Length of Side: "+r.getLength_of_Side()+" Proportion: "+r.getProportion());
        //test matmul
        int a=2,b=3;
        int c=2,d=5;
        double [][] ar1 = Matrix.Input_a_matrix(a,b);
        Matrix m1 = new Matrix(a, b, ar1);
        m1.show_mat();
        double [][] ar2 = Matrix.Input_a_matrix(c,d);
        Matrix m2 = new Matrix(c, d, ar2);
        m2.show_mat();
        try {
            Matrix m3 = m1.Matrix_multiply(m2);
            m3.show_mat();
        }catch (IllegalMatrixMultiply e){
            System.out.println(e.getMessage());
        }

    }
}
