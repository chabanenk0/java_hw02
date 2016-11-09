package com.github.chabanenk0.Shapes;

import com.github.chabanenk0.Exception.WrongInputDataException;

import java.io.*;

/**
 * Created by dchabanenko on 09.11.16.
 */
public class Rectangle extends AbstractShape implements InputableInterface {
    protected double a;
    protected double b;

    public Rectangle()
    {
        this.a = 10;
        this.b = 10;
    }

    public Rectangle(double a, double b) throws WrongInputDataException {
        if (a < 0) {
            throw new WrongInputDataException("Vertex length cannot be negative");
        }
        if (b < 0) {
            throw new WrongInputDataException("Vertex length cannot be negative");
        }

        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) throws WrongInputDataException {
        if (a < 0) {
            throw new WrongInputDataException("Vertex length cannot be negative");
        }

        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) throws WrongInputDataException {
        if (a < 0) {
            throw new WrongInputDataException("Vertex length cannot be negative");
        }

        this.b = b;
    }

    public double calculateArea() {
        return this.a * this.b;
    }

    public double calculatePerimeter() {
        return 2 * (this.a + this.b);
    }

    public void inputFromStream(InputStream reader, boolean outputQuestions, PrintStream consoleOut) throws WrongInputDataException, IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(reader));
        if (outputQuestions) {
            consoleOut.println("Creating new Rectangle...");
            consoleOut.println("Input the vertices lengths:");
            consoleOut.println("a = ");
        }
        double a = this.readDouble(bufferedReader);
        this.setA(a);
        if (outputQuestions) {
            consoleOut.println("b = ");
        }
        double b = this.readDouble(bufferedReader);
        this.setB(b);
    }

    public Triangle getDiagonalTriangle() throws WrongInputDataException {
        return new Triangle(a, b, Math.sqrt(a * a + b * b));
    }

    public String toString() {
        return "Rectangle(" + this.a + ", " + this.b + ")";
    }

}
