package com.github.chabanenk0.Shapes;

import java.awt.geom.Point2D;

/**
 * Created by dchabanenko on 09.11.16.
 */
public class Circle extends AbstractShape
{
    private Point2D.Double center;
    private double radius;

    public Circle()
    {
        this.center = new Point2D.Double(0,0);
        this.radius = 0;
    }

    public Circle(double radius)
    {
        this.center = new Point2D.Double(0,0);
        this.radius = radius;
    }

    public Circle(double radius, double x, double y)
    {
        this.center = new Point2D.Double(x, y);
        this.radius = radius;
    }

    public Circle(double radius, Point2D.Double center)
    {
        this.center = center;
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public Point2D.Double getCenter() {
        return center;
    }

    public void setCenter(Point2D.Double center) {
        this.center = center;
    }

    public void setCenter(double x, double y) {
        this.center = new Point2D.Double(x, y);
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
