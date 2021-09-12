package com.codecool.geometry.shapes;

public class Triangle extends Shape {


    public Triangle(double a, double b, double c, String name) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double calculateArea() {
        return this.b * this.m * 0.5;
    }


    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }


    public String toString() {
        return "Triangle: " + "a = " + a + " b = " + b + " c = " + c + " m = " + m;
    }


 //---------------------------------------------------------------------------------------------------
    // FIELDS

    private double a;
    private double b;
    private double c;
    private double m;
}
