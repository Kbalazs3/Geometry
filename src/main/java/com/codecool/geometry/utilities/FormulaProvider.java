package com.codecool.geometry.utilities;
import com.codecool.geometry.shapes.Circle;
import com.codecool.geometry.shapes.EquilateralTriangle;
import com.codecool.geometry.shapes.Rectangle;
import com.codecool.geometry.shapes.RegularPentagon;
import com.codecool.geometry.shapes.Shape;
import com.codecool.geometry.shapes.Square;
import com.codecool.geometry.shapes.Triangle;

public class FormulaProvider {



    /**
     * Returns the area formula for a given shape.
     *
     * @param shape type of the shape of the requested formula
     * @return area formula
     */
    public static String getAreaForShape(Shape shape) {
        if(shape instanceof Triangle) {
            return "sqrt(s×(s-a)×(s-b)×(s-c))";
        }

        else if(shape instanceof Square) {
            return "a×a";
        }
        else if(shape instanceof Rectangle) {
            return " a×b";
        }
        else if(shape instanceof EquilateralTriangle) {
            return "a×a×sqrt(3)/4";
        }
        else if(shape instanceof RegularPentagon) {
            return "a×a×sqrt(5×(5+2×sqrt(5))/4";
        }
        else if(shape instanceof Circle) {
            return " π×r×r";
        }
        return "";
    }

    /**
     * Returns the perimeter formula for a given shape.
     *
     * @param shape type of the shape of the requested formula
     * @return perimeter formula
     */
    public static String getPerimeterForShape(Shape shape) {
        if(shape instanceof Triangle) {
            return " a+b+c";
        }
        else if(shape instanceof Rectangle) {
            return " 2xa + 2xb";
        }
        else if(shape instanceof EquilateralTriangle) {
            return "3×a";
        }
        else if(shape instanceof RegularPentagon) {
            return "5xa";
        }
        else if(shape instanceof Circle) {
            return " π×2×r";
        }
    return "";
    }
}
