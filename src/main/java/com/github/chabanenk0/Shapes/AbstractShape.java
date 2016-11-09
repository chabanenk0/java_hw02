package com.github.chabanenk0.Shapes;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * AbstractShape class
 * Created by dchabanenko on 09.11.16.
 */
public abstract class AbstractShape implements ShapeInterface
{
    protected double readDouble(BufferedReader bufferedReader) throws IOException
    {
        String inputString = bufferedReader.readLine();
        double number = Double.parseDouble(inputString);
        return number;
    }
}
