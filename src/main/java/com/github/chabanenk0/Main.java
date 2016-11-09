package com.github.chabanenk0;

import com.github.chabanenk0.Exception.WrongInputDataException;
import com.github.chabanenk0.Shapes.AbstractShape;
import com.github.chabanenk0.Shapes.Circle;
import com.github.chabanenk0.Shapes.Rectangle;
import com.github.chabanenk0.Shapes.Triangle;

import java.io.IOException;

/**
 * Main class for inheritance homework
 * Created by dchabanenko on 09.11.16.
 */
public class Main {

    private static Circle inputCircleFromConsole()
    {
        Circle circle = new Circle();
        try {
            circle.inputFromStream(System.in, true, System.out);
        } catch (WrongInputDataException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return circle;
    }

    private static Triangle inputTriangleFromConsole()
    {
        Triangle triangle = new Triangle();
        try {
            triangle.inputFromStream(System.in, true, System.out);
        } catch (WrongInputDataException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return triangle;
    }

    private static Rectangle inputRectangleFromConsole()
    {
        Rectangle rectangle = new Rectangle();
        try {
            rectangle.inputFromStream(System.in, true, System.out);
        } catch (WrongInputDataException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rectangle;
    }

    public static void main(String[] args) {
        System.out.println("Select the shape code to create:");
        try {
            AbstractShape.ShapeType shapeType = AbstractShape.readShapeType();
            switch (shapeType) {
                case CIRCLE:
                    Circle circle = inputCircleFromConsole();
                    System.out.println("Circle:" + circle.toString());
                    System.out.println("Area:" + circle.calculateArea());
                    System.out.println("Perimeter:" + circle.calculatePerimeter());
                    break;
                case TRIANGLE:
                    Triangle triangle = inputTriangleFromConsole();
                    System.out.println("Triangle:" + triangle.toString());
                    System.out.println("Area:" + triangle.calculateArea());
                    System.out.println("Perimeter:" + triangle.calculatePerimeter());
                    break;
                case RECTANGLE:
                    Rectangle rectangle = inputRectangleFromConsole();
                    System.out.println("Rectangle:" + rectangle.toString());
                    System.out.println("Area:" + rectangle.calculateArea());
                    System.out.println("Perimeter:" + rectangle.calculatePerimeter());
                    System.out.println("Diagonal triangle:" + rectangle.getDiagonalTriangle().toString());
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
