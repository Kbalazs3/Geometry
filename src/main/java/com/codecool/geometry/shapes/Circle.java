package com.codecool.geometry.shapes;

public class Circle extends Shape {


    public Circle(double r, String name) {
        super(name);
        this.r = r;
    }


    @Override
    public double calculateArea() {
        return r * 3.14;
    }


    @Override
    public double calculatePerimeter() {
        // TODO calculate cirycle periemter
        return (r * r) * 3.14;
    }


    public String toString() {
        return "Circle: " + " r = " + r;
    }


//-------------------------------------------------------------------------------------------------
    // FIELDS

    private double r;


}