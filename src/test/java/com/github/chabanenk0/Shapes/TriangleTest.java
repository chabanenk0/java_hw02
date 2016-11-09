package com.github.chabanenk0.Shapes;

import com.github.chabanenk0.Exception.WrongInputDataException;
import org.junit.Test;

import java.awt.geom.Point2D;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.*;
public class TriangleTest {
    // delta for double comparison
    private double delta = 0.0001;

    @Test
    public void triangleTest() throws WrongInputDataException {
        Triangle triangle = new Triangle();
        assertNotNull(triangle);
        assertNotNull(triangle.getA());
        assertNotNull(triangle.getB());
        assertNotNull(triangle.getC());
    }

    @Test
    public void calculatePerimeterTest()
    {
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;
        Triangle triangle = null;
        try {
            triangle = new Triangle(a, b, c);
        } catch (WrongInputDataException e) {
            e.printStackTrace();
        }
        double perimeter = triangle.calculatePerimeter();
        double correctPerimeter = a + b + c;
        assertEquals(correctPerimeter, perimeter, this.delta);
    }

    @Test
    public void calculateAreaTest()
    {
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;
        Triangle triangle = null;
        try {
            triangle = new Triangle(a, b, c);
        } catch (WrongInputDataException e) {
            e.printStackTrace();
        }
        double area = triangle.calculateArea();
        double halfPerimeter = (a + b + c) / 2;
        double correctArea = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
        assertEquals(correctArea, area, this.delta);
    }
}
