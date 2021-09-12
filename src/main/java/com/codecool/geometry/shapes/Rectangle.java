package com.codecool.geometry.shapes;

public class Rectangle extends Shape {


    public Rectangle(double width, double height, String name) {
        super(name);
        this.width = width;
        this.height = height;
    }


    @Override
    public double calculatePerimeter() {
        return 2* this.width + 2 * this.height;
    }


    @Override
    public double calculateArea() {
        return this.height * this.width;
    }



    public String toString() {
        return "Rectangle: " + "a =" + width + "b = " + height;
    }


//-------------------------------------------------------------------------------------------------
    // Fields

    private double width;
    private double height;
}
