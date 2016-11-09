package com.github.chabanenk0.Shapes;

import com.github.chabanenk0.Exception.WrongInputDataException;

import java.awt.geom.Point2D;
import java.io.*;

/**
 * Created by dchabanenko on 09.11.16.
 */
public class Circle extends AbstractShape implements InputableInterface
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

    public void setRadius(double radius) throws WrongInputDataException {
        if (radius < 0) {
            throw new WrongInputDataException("Radius cannot be negative");
        }
        this.radius = radius;
    }

    public void inputFromStream(InputStream reader, boolean outputQuestions, PrintStream consoleOut) throws WrongInputDataException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(reader));
        if (outputQuestions) {
            consoleOut.println("Creating new Circle...");
            consoleOut.println("radius = ");
        }
        double radius = this.readDouble(bufferedReader);
        this.setRadius(radius);
        if (outputQuestions) {
            consoleOut.println("Center:");
            consoleOut.println("x = ");
        }
        double x = this.readDouble(bufferedReader);
        if (outputQuestions) {
            consoleOut.println("y = ");
        }
        double y = this.readDouble(bufferedReader);
        this.setCenter(new Point2D.Double(x, y));
    }
}
