package homework_02;

import java.util.Scanner;

public class Complex {
    private double a;
    private double b;

    // Constructors
    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Complex(double a) {
        this.a = a;
        this.b = 0;
    }

    public Complex() {
        this.a = 0;
        this.b = 0;
    }

    public double getRealPart() {
        return a;
    }

    public double getImaginaryPart() {
        return b;
    }

    public Complex add(Complex other) {
        double realPart = this.a + other.a;
        double imaginaryPart = this.b + other.b;
        return new Complex(realPart, imaginaryPart);
    }

    public Complex subtract(Complex other) {
        double realPart = this.a - other.a;
        double imaginaryPart = this.b - other.b;
        return new Complex(realPart, imaginaryPart);
    }

    public Complex multiply(Complex other) {
        double realPart = this.a * other.a - this.b * other.b;
        double imaginaryPart = this.a * other.b + this.b * other.a;
        return new Complex(realPart, imaginaryPart);
    }

    public Complex divide(Complex other) {
        double denominator = other.a * other.a + other.b * other.b;
        double realPart = (this.a * other.a + this.b * other.b) / denominator;
        double imaginaryPart = (this.b * other.a - this.a * other.b) / denominator;
        return new Complex(realPart, imaginaryPart);
    }

    public double abs() {
        return Math.sqrt(a * a + b * b);
    }

    @Override
    public String toString() {
        if (b != 0) {
            return a + " + " + b + "i";
        } else {
            return String.valueOf(a);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first complex number (a b): ");
        double a1 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        Complex num1 = new Complex(a1, b1);

        System.out.print("Enter the second complex number (a b): ");
        double a2 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        Complex num2 = new Complex(a2, b2);

        System.out.println(num1 + " + " + num2 + " = " + num1.add(num2));
        System.out.println(num1 + " - " + num2 + " = " + num1.subtract(num2));
        System.out.println(num1 + " * " + num2 + " = " + num1.multiply(num2));
        System.out.println(num1 + " / " + num2 + " = " + num1.divide(num2));
        System.out.println("|" + num1 + "| = " + num1.abs());

        scanner.close();
    }
}

