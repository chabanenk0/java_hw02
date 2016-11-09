package com.github.chabanenk0.Shapes;

import com.github.chabanenk0.Exception.WrongInputDataException;

import java.io.*;

/**
 * Created by dchabanenko on 09.11.16.
 */
public class Triangle extends AbstractShape implements InputableInterface {
    // triangle vertices lengths
    private double a;
    private double b;
    private double c;

    public Triangle()
    {
        this.a = 3;
        this.b = 4;
        this.c = 5;
    }

    public Triangle(double a, double b, double c) throws WrongInputDataException {
        this.a = a;
        this.b = b;
        this.c = c;
        if (!validate()) {
            throw new WrongInputDataException("Triangle is not valid");
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) throws WrongInputDataException {
        if (a < 0) {
            throw new WrongInputDataException("Vertex length cannot be negative");
        }

//        double oldA = this.a;
        this.a = a;
//        if (!validate()) {
//            this.a = oldA;
//            throw new WrongInputDataException("Triangle is not valid");
//        }
        // @todo is validation needed when changing one variable?
    }

    public double getB() {
        return b;
    }

    public void setB(double b) throws WrongInputDataException {
        if (b < 0) {
            throw new WrongInputDataException("Vertex length cannot be negative");
        }

//        double oldB = this.b;
        this.b = b;
//        if (!validate()) {
//            this.b = oldB;
//            throw new WrongInputDataException("Triangle is not valid");
//        }
        // @todo is validation needed when changing one variable?
    }

    public double getC() {
        return c;
    }

    public void setC(double c) throws WrongInputDataException {
        if (c < 0) {
            throw new WrongInputDataException("Vertex length cannot be negative");
        }

//        double oldC = this.c;
        this.c = c;
//        if (!validate()) {
//            this.c = oldC;
//            throw new WrongInputDataException("Triangle is not valid");
//        }
        // @todo is validation needed when changing one variable?
    }

    public double calculateArea() {
        double p = this.calculatePerimeter() / 2; // half-perimeter

        return Math.sqrt(p * (p - this.getA()) * (p - this.getB()) * (p - this.getC()));
    }

    public double calculatePerimeter() {
        return this.a + this.b + this.c;
    }

    public boolean validate()
    {
        // don't validate empty object
        if (0 == this.a) {
            return true;
        }
        if (0 == this.b) {
            return true;
        }
        if (0 == this.c) {
            return true;
        }

        if (!validatePartial(this.a, this.b, this.c)) {
            return false;
        }
        if (!validatePartial(this.b, this.a, this.c)) {
            return false;
        }
        if (!validatePartial(this.c, this.a, this.b)) {
            return false;
        }

        return true;
    }

    private boolean validatePartial(double a, double b, double c)
    {
        if (a >= b + c) {
            return false;
        }

        return true;
    }

    public void inputFromStream(InputStream reader, boolean outputQuestions, PrintStream consoleOut) throws WrongInputDataException, IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(reader));
        if (outputQuestions) {
            consoleOut.println("Creating new Triangle...");
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
        if (outputQuestions) {
            consoleOut.println("c = ");
        }
        double c = this.readDouble(bufferedReader);
        this.setC(c);
    }

    public String toString() {
        return "Triangle(" + this.a + ", " + this.b + ", " +  this.c + ")";
    }
}
