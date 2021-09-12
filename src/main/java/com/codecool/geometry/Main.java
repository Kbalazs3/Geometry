package com.codecool.geometry;
import java.sql.SQLOutput;
import java.util.Scanner;

import com.codecool.geometry.containers.ShapeCollection;
import com.codecool.geometry.shapes.Circle;
import com.codecool.geometry.shapes.EquilateralTriangle;
import com.codecool.geometry.shapes.Rectangle;
import com.codecool.geometry.shapes.RegularPentagon;
import com.codecool.geometry.shapes.Square;
import com.codecool.geometry.shapes.Triangle;
import com.codecool.geometry.utilities.FormulaProvider;

import javax.sound.midi.Soundbank;

public class Main {

    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        ShapeCollection sCollector = new ShapeCollection();
        FormulaProvider formulaP = new FormulaProvider();

        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);




	    while (isRunning) {
	        System.out.println("Main Menu\n\n " +
                    "Add new Shape (1)" +
                    "\n Show all shapes(2)" +
                    "\n Show shape with th largest perimeter(3)" +
                    "\n Show shape tha largest area(4)" +
                    "\n Show formulas(5)" +
                    "\n Exit(0)\n\n\n");

            int option = scanner.nextInt();


            switch (option) {
                case 1:

                    int addShapeInput = scanner.nextInt();
                            switch(addShapeInput) {
                                case 1:
                                    // TODO fixing needed
                                    getShape();
                                    s;
                                case 2:
                                    System.out.print(sCollector.getShapesTable());
                                case 3:
                                    System.out.print(sCollector.getLargestShapeByPerimeter());
                                case 4:
                                    System.out.print(sCollector.getLargestShapeArea());
                                case 5:
                                    // TODO fix formula printing
                                    System.out.print(formulaP.);
                                case 6:
                                    System.exit(0);


                        }
                    // TODO Add new shape
                    break;
                case 2:
                    // TODO Show all shapes
                    break;
                case 3:

                    // TODO Show shape with the largest perimeter
                    break;
                case 4:
                    // TODO Show shape with the largest area
                    break;
                case 5:
                    // TODO Show formulas
                    break;
                case 0:
                    // TODO Exit
                    break;
            }
        }
    }

    public static String getShape() {
        int option2 = scanner.nextInt();
        System.out.print("\"Choose a Shape:\" +\n" +
                "           \"\\n Circle(1)\" +\n" +
                "            \"\\n Equilateral Triangle(2)\" +\n" +
                "             \"\\n Rectangle (3)\" +\n" +
                "             \"\\n Regular Pentagon (4)\" +\n" +
                "             \"\\n Square (5)\" +\n" +
                "             \"\\n Triangle (6)\\n\\n\\n\"");

          switch(option2) {
            case 1:
                return "Circle";
            case 2:
                return "Equilateral Triangle";
            case 3:
                return "Rectangle";
            case 4:
                return "Regular Pentagon";
            case 5:
                return "Square";

          }
        return "";
}


}
