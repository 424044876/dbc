package com.fang;

import java.util.Scanner;

public class Matrix {
    private int row;
    private int column;
    private double [][] mat;

    public Matrix() {}

    public Matrix(int r, int c, double [][] mat){
        row = r;
        column = c;
        this.mat = mat;
    }

    public Matrix(int r, int c){
        row = r;
        column = c;
        mat = new double[r][c];
    }

    public Matrix Matrix_multiply(Matrix b){
        Matrix result;
        if (this.column != b.row){
            result = new Matrix(0, 0);
            return result;
        }
        result = new Matrix(this.row, b.column);
        for (int i = 0; i < this.row ; i += 1){
            for (int j = 0; j < b.column; j += 1){
                result.mat[i][j] = 0;
                for (int k = 0; k < this.column ; k +=1){
                    result.mat[i][j] += this.mat[i][k] * b.mat[k][j];
                }
            }
        }
        return result;
    }

    public void show_mat(){
        for (double[] row: mat){
            for (double d: row){
                System.out.print(d+" ");
            }
            System.out.print('\n');
        }
    }

    public static double [][] Input_a_matrix(int r, int c){
        double [][] mat = new double[r][c];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < r ; i += 1){
            for (int j = 0; j < c; j += 1){
                mat[i][j] = scanner.nextDouble();
            }
        }
        return mat;
    }
}
