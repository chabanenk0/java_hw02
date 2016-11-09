package com.github.chabanenk0.Shapes;

import org.junit.Test;

import java.awt.geom.Point2D;

import static org.junit.Assert.*;

/**
 * Created by dchabanenko on 09.11.16.
 */
public class CircleTest {
    // delta for double comparison
    private double delta = 0.0001;

    @Test
    public void circleTest()
    {
        Circle circle = new Circle();
        assertNotNull(circle);
        assertNotNull(circle.getCenter());
        assertNotNull(circle.getRadius());
    }

    @Test
    public void circleRadiusTest()
    {
        double radius = 10.3;
        Circle circle = new Circle(radius);
        assertNotNull(circle);
        assertNotNull(circle.getCenter());
        assertNotNull(circle.getRadius());
        assertEquals(radius, circle.getRadius(), this.delta);
    }

    @Test
    public void circleCenterDoubleTest()
    {
        double radius = 10.3;
        double x = 10.0;
        double y = 15.0;
        Circle circle = new Circle(radius, x, y);
        assertNotNull(circle);
        assertNotNull(circle.getCenter());
        assertEquals(x, circle.getCenter().getX(), this.delta);
        assertEquals(y, circle.getCenter().getY(), this.delta);
    }

    @Test
    public void circleCenterPointTest()
    {
        double radius = 10.3;
        double x = 10.0;
        double y = 15.0;
        Point2D.Double point = new Point2D.Double(x, y);
        Circle circle = new Circle(radius, point);
        assertNotNull(circle);
        assertNotNull(circle.getCenter());
        assertEquals(x, circle.getCenter().getX(), this.delta);
        assertEquals(y, circle.getCenter().getY(), this.delta);
    }

    @Test
    public void calculatePerimeterTest()
    {
        double radius = 5.0;
        double x = 10.0;
        double y = 15.0;
        Circle circle = new Circle(radius, x, y);
        double perimeter = circle.calculatePerimeter();
        double correctPerimeter = 2 * Math.PI * radius;
        assertEquals(correctPerimeter, perimeter, this.delta);
    }

    @Test
    public void calculateAreaTest()
    {
        double radius = 5.0;
        double x = 10.0;
        double y = 15.0;
        Circle circle = new Circle(radius, x, y);
        double area = circle.calculateArea();
        double correctArea = Math.PI * radius * radius;
        assertEquals(correctArea, area, this.delta);
    }

}
