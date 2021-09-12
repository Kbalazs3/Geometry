package com.codecool.geometry.shapes;

public class Square extends Rectangle {



    public  Square(String name, double width) {
        super(width, width, name);
        this.aSide = width;
    }


    public String toString() {
        return "Square: " + "a side = " + String.valueOf(aSide);
    }


//---- -----------------------------------------------------------------------------------------------------
    // Fields

    private double aSide;
    private String name;
}
