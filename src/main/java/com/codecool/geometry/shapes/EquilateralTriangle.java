package com.codecool.geometry.shapes;

public class EquilateralTriangle extends Triangle {


    public EquilateralTriangle(double side, String name) {
        super(side, side, side, name);
        this.a = side;
    }


    public String toString(double a, double b, double c) {
        return "Equilateral triangle: " + "a = " + String.valueOf(a) + " b = " + String.valueOf(b) + " c = " + String.valueOf(c);
    }


//----------------------------------------------------------------------------------------------------
    // FIELDS

    private double a;
}
