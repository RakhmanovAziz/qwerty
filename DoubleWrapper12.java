package org.zadacha31;
import java.util.Scanner;

public class DoubleWrapper12 {
    private double value;

    public DoubleWrapper12(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    // Статический метод для сложения двух чисел типа double
    public static double add(double a, double b) {
        return a + b;
    }

    // Статический метод для деления двух чисел типа double
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    // Статический метод для возведения числа типа double в степень
    public static double pow(double a, double b) {
        return Math.pow(a, b);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        DoubleWrapper12 a1 = new DoubleWrapper12(a);
        DoubleWrapper12 b1 = new DoubleWrapper12(b);

        System.out.println("Сумма: " + DoubleWrapper12.add(a, b));
        System.out.println("Деление: " + DoubleWrapper12.divide(a, b));
        System.out.println("Возведение в степень: " + DoubleWrapper12.pow(a, b));

        scanner.close();
    }


}
