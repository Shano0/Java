package com.edu.btu;


public class Main {

    public static void main(String[] args) {

        CalculatorServiceImpl calculator = new CalculatorServiceImpl();

        int a = 5;
        int b = 4;

        System.out.println(calculator.sum(a, b));
        System.out.println(calculator.prod(a, b));
    }
}