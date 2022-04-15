package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        System.out.println("insira o primeiro valor:");
        a = scanner.nextDouble();
        System.out.println("insira o segundo valor:");
        b = scanner.nextDouble();
        System.out.println("soma "+ (a) +" + " + (b)+ " = " + soma(a,b));
        System.out.println("subtração "+ (a) +" - " + (b) + " = " + subtração(a,b));
        System.out.println("divisão "+ (a) +" / " + (b) + " = " + divisão(a,b));
        System.out.println("multiplicação "+ (a) +" * " + (b) + " = " + multiplicação(a,b));
        System.out.println("Obrigado pela preferência !!");
    }
    public static double soma(double a, double b) {
        return a + b;
    }
    public static double subtração(double a, double b) {
        return a - b;
    }
    public static double multiplicação(double a, double b) {
        return a * b;
    }
    public static double divisão(double a, double b) {
        return a / b;
    }
}
