package com.company;

public class Calculator {
    private int a;
    private int b;

    public int getA() {return a;}
    public void setA(int a) {this.a = a;}
    public int getB() {return b;}
    public void setB(int b) {this.b = b;}

    public int plus(int a, int b) {
        return a + b;
    }
    public int minus(int a, int b) {
        return a - b;
    }
    public int mnogim(int a, int b) {
        return a * b;
    }
    public int delim(int a, int b) {
        return a / b;
    }

}
