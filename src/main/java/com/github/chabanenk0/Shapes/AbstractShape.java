package com.github.chabanenk0.Shapes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * AbstractShape class
 * Created by dchabanenko on 09.11.16.
 */
public abstract class AbstractShape implements ShapeInterface
{
    private static int maxRetriesNumber = 10;
    public enum ShapeType {
        CIRCLE(1),
        TRIANGLE(2),
        RECTANGLE(3),
        SQUARE(4);

        ShapeType(int shapeCode) {
            this.shapeCode = shapeCode;
        }

        private int shapeCode;
    }

    protected double readDouble(BufferedReader bufferedReader) throws IOException
    {
        String inputString = bufferedReader.readLine();
        double number = Double.parseDouble(inputString);
        return number;
    }

    public static ShapeType readShapeType() throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int retriesNumber = 0;

        System.out.println("Select the shape code to create:");
        for(AbstractShape.ShapeType shapeType: AbstractShape.ShapeType.values()) {
            System.out.println(shapeType.shapeCode + " : " + shapeType.toString());
        }

        do {
            String inputString = bufferedReader.readLine();
            int shapeTypeCode = Integer.parseInt(inputString);
            for(ShapeType shapeType : ShapeType.values()) {
                if(shapeTypeCode == shapeType.shapeCode) {
                    return shapeType;
                }
            }
        } while (retriesNumber < AbstractShape.maxRetriesNumber);
        throw new Exception("Wrong Shape type constant ");

    }
}
