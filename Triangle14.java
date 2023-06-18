package org.zadacha31;

public class Triangle14 {
    public static void main(String[] args) {
        calculateTriangles();
    }
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle14(double a, double b, double c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    public static void calculateTriangles() {
        Triangle14 t = new Triangle14(3, 4, 5);
        System.out.println("Perimeter: " + t.getPerimeter()); // 12.0
        System.out.println("Area: " + t.getArea()); // 6.0

        RightTriangle rt = new RightTriangle(3, 4);
        System.out.println("Perimeter: " + rt.getPerimeter()); // 12.0
        System.out.println("Area: " + rt.getArea()); // 6.0
        System.out.println("Hypotenuse: " + rt.getHypotenuse()); // 5.0
    }


}


class RightTriangle extends Triangle14 {
    public RightTriangle(double a, double b) {
        super(a, b, Math.sqrt(a * a + b * b)); // находим гипотенузу по теореме Пифагора
    }

    public double getHypotenuse() {
        return getSideC();
    }
}

