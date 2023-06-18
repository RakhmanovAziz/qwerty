
package org.zadacha31;

public class ComplexNumber23 {
    private int[] parts; // Ìàññèâ äëÿ õðàíåíèÿ âåùåñòâåííîé è ìíèìîé ÷àñòåé

    public ComplexNumber23(int realPart, int imaginaryPart) {
        parts = new int[2];
        parts[0] = realPart; // Âåùåñòâåííàÿ ÷àñòü
        parts[1] = imaginaryPart; // Ìíèìàÿ ÷àñòü
    }

    public ComplexNumber23 add(ComplexNumber23 other) {
        int real = this.parts[0] + other.parts[0];
        int imaginary = this.parts[1] + other.parts[1];
        return new ComplexNumber23(real, imaginary);
    }

    public ComplexNumber23 subtract(ComplexNumber23 other) {
        int real = this.parts[0] - other.parts[0];
        int imaginary = this.parts[1] - other.parts[1];
        return new ComplexNumber23(real, imaginary);
    }

    public ComplexNumber23 multiply(ComplexNumber23 other) {
        int real = this.parts[0] * other.parts[0] - this.parts[1] * other.parts[1];
        int imaginary = this.parts[0] * other.parts[1] + this.parts[1] * other.parts[0];
        return new ComplexNumber23(real, imaginary);
    }

    public int getRealPart() {
        return parts[0];
    }

    public int getImaginaryPart() {
        return parts[1];
    }

    public void setRealPart(int realPart) {
        parts[0] = realPart;
    }

    public void setImaginaryPart(int imaginaryPart) {
        parts[1] = imaginaryPart;
    }

    @Override
    public String toString() {
        return parts[0] + " + " + parts[1] + "i";
    }

    public static void main(String[] args) {
        ComplexNumber23 number1 = new ComplexNumber23(2, 3);
        ComplexNumber23 number2 = new ComplexNumber23(1, 4);

        // Сложение
        ComplexNumber23 sum = number1.add(number2);
        System.out.println("Сумма: " + sum);

        // Вычитание
        ComplexNumber23 difference = number1.subtract(number2);
        System.out.println("Разность: " + difference);

        // Умножение
        ComplexNumber23 product = number1.multiply(number2);
        System.out.println("Произведение: " + product);
    }
}