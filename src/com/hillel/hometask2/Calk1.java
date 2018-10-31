package com.hillel.hometask2;

public class Calk1 {
    public static double add(double a, double b, double c) {
        double result = a + b * (c / 2);
        return result;
    }
    public static int pow(int a, int b) {
        int res1 = (a * a + b * b) % 2;
        return res1;
    }
    public static double pow1(double a, int b, double c) {
        double res2 = (a + b) / 12 * c % 4 + b;
        return res2;
    }
    public static double mod(int a, int b, double c) {
        double res4 = (a - b * c) / (a + b) % c;
        return res4;
    }
}
