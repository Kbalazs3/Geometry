package com.codecool.geometry.containers;
import java.util.ArrayList;

import com.codecool.geometry.shapes.Circle;
import com.codecool.geometry.shapes.EquilateralTriangle;
import com.codecool.geometry.shapes.Rectangle;
import com.codecool.geometry.shapes.RegularPentagon;
import com.codecool.geometry.shapes.Shape;
import com.codecool.geometry.shapes.Square;
import com.codecool.geometry.shapes.Triangle;

public class ShapeCollection {



    public void addShapes(Shape newShape) {
        shapes.add(newShape);
    }


    public StringBuilder getShapesTable() {
        StringBuilder table = new StringBuilder();

        for(int i = 0; i<shapes.size(); i++) {
            table.append("/--------------------------------------------------------------------" +
                        "----------------------------------------------------------------\\\n");
            table.append(shapes.get(i).getName());
            table.append("\\--------------------------------------------------------------------" +
                            "----------------------------------------------------------------/\n");
        }
        return table;
    }


    public Shape getLargestShapeByPerimeter() {
        Shape highestPerimeterShape = shapes.get(0);
        double highestPerimeter = highestPerimeterShape.calculatePerimeter();

        for(Shape s : shapes) {
            if(s.calculatePerimeter() > highestPerimeter) {
                highestPerimeter = s.calculatePerimeter();
                highestPerimeterShape = s;
            }
        }
        return highestPerimeterShape;
    }


    public Shape getLargestShapeArea() {
        Shape highestAreaShape = shapes.get(0);
        double highestArea = highestAreaShape.calculateArea();

        for(Shape s : shapes) {
            if(s.calculateArea() > highestArea) {
                highestArea = s.calculatePerimeter();
                highestAreaShape = s;
            }
        }
        return highestAreaShape;
}


//--------------------------------------------------------------------------------------------------
    // FIELDS

    private ArrayList<Shape> shapes = new ArrayList<>();


}
