package com.codecool.geometry.shapes;

public class RegularPentagon extends Shape {


    public RegularPentagon(double side, String name) {
        super(name);
        this.a = side;
    }


    @Override
    public double calculateArea() {
        return (a * triangleHeight)/ 2 * 5;
    }


    @Override
    public double calculatePerimeter() {
        return a * 5;
    }


    public String toString() {
        return "RegularPentagon: " + " a = " + a;
    }


//----------------------------------------------------------------------------------------------------
    // FIELDS

    private double a;
    private double triangleHeight;


}
