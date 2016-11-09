package com.github.chabanenk0.Shapes;

import com.github.chabanenk0.Exception.WrongInputDataException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by dchabanenko on 09.11.16.
 */
public class RectangleTest {
    // delta for double comparison
    private double delta = 0.0001;

    @Test
    public void rectangleTest() throws WrongInputDataException {
        Rectangle rectangle = new Rectangle();
        assertNotNull(rectangle);
        assertNotNull(rectangle.getA());
        assertNotNull(rectangle.getB());
    }

    @Test
    public void calculatePerimeterTest()
    {
        double a = 3.0;
        double b = 4.0;
        Rectangle rectangle = null;
        try {
            rectangle = new Rectangle(a, b);
        } catch (WrongInputDataException e) {
            e.printStackTrace();
        }
        double perimeter = rectangle.calculatePerimeter();
        double correctPerimeter = (a + b) * 2;
        assertEquals(correctPerimeter, perimeter, this.delta);
    }

    @Test
    public void calculateAreaTest()
    {
        double a = 3.0;
        double b = 4.0;
        Rectangle rectangle = null;
        try {
            rectangle = new Rectangle(a, b);
        } catch (WrongInputDataException e) {
            e.printStackTrace();
        }
        double area = rectangle.calculateArea();
        double correctArea = a * b;
        assertEquals(correctArea, area, this.delta);
    }

}
