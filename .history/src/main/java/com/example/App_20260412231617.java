package com.example;

public class App {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    public long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // ✅ MAIN METHOD (RUN THIS)
    public static void main(String[] args) {

        App obj = new App();

        System.out.println("Addition: " + obj.add(2, 3));
        System.out.println("Multiplication: " + obj.multiply(2, 3));
        System.out.println("Is Even (4): " + obj.isEven(4));
        System.out.println("Factorial (5): " + obj.factorial(5));
        System.out.println("Is Prime (7): " + obj.isPrime(7));
    }
}