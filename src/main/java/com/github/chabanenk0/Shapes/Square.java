package com.github.chabanenk0.Shapes;

import com.github.chabanenk0.Exception.WrongInputDataException;

import java.io.*;

/**
 * Created by dchabanenko on 09.11.16.
 */
public class Square extends Rectangle {
    public Square()
    {
        this.a = 10;
        this.b = 10;
    }

    public Square(double a)
    {
        this.a = a;
        this.b = a;
    }

    public void setA(double a) throws WrongInputDataException {
        // @todo disable getB method?
        this.a = a;
        this.b = a;

    }


    public void setB(double b) throws WrongInputDataException {
        // @todo disable getB method?
        this.a = a;
        this.b = a;
    }

    public void inputFromStream(InputStream reader, boolean outputQuestions, PrintStream consoleOut) throws WrongInputDataException, IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(reader));
        if (outputQuestions) {
            consoleOut.println("Creating new Square...");
            consoleOut.println("Input the vertice length:");
            consoleOut.println("a = ");
        }
        double a = this.readDouble(bufferedReader);
        this.setA(a);
    }

    public String toString() {
        return "Square(" + this.a +")";
    }
}
