package com.codecool.geometry.shapes;


/**
 * This is a abstract class representing geometrical shape.
 */
public abstract class Shape {




    public Shape(String name) {
        this.name = name;
    }


    /**
     * Calculates shape's area.
     *
     * @return area of the shape
     */
    public abstract double calculateArea();

    /**
     * Calculates shape's perimeter.
     *
     * @return perimeter of the shape
     */
    public abstract double calculatePerimeter();

    /**
     * Check if all args are greater than 0
     * Throws IllegalArgumentException if any of the parameters is 0 or less.
     *
     * @param args
     * @return true if all of args are greater than 0
     */


    public static boolean checkIfArgsGreaterThanZero(float args) {
        if(args > 0) {
            return true;
        }
        return false;
    }



    public String getName() {
        return name;
    }


    //---------------------------------------------------------------------------------------------------
        // FIELDS



    private String name;

}
