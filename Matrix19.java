package org.zadacha31;

public class Matrix19 {
    private int rows;
    private int cols;
    private double[][] data;

    public Matrix19(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];
    }

    public Matrix19(double[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = data;
    }

    public static Matrix19 zeros(int rows, int cols) {
        return new Matrix19(rows, cols);
    }

    public static Matrix19 random(int rows, int cols) {
        Matrix19 matrix = new Matrix19(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix.data[i][j] = Math.random();
            }
        }
        return matrix;
    }

    public Matrix19 add(Matrix19 other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Matrices must have the same dimensions");
        }

        Matrix19 result = new Matrix19(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }

        return result;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix19 a = Matrix19.random(3, 3);
        Matrix19 b = Matrix19.zeros(3, 3);
        Matrix19 c = a.add(b);

        System.out.println("Matrix a:");
        a.print();
        System.out.println("Matrix b:");
        b.print();
        System.out.println("Matrix c:");
        c.print();


    }


}