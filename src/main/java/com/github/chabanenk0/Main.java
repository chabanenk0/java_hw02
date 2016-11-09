package com.github.chabanenk0;

import com.github.chabanenk0.Exception.WrongInputDataException;
import com.github.chabanenk0.Shapes.Circle;

import java.io.IOException;

/**
 * Main class for inheritance homework
 * Created by dchabanenko on 09.11.16.
 */
public class Main {

    private static Circle inputCircleFromConsole()
    {
        Circle circle = new Circle();
        try {
            circle.inputFromStream(System.in, true, System.out);
        } catch (WrongInputDataException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return circle;
    }
    public static void main(String[] args) {
        Circle circle = inputCircleFromConsole();
        System.out.println("Area:" + circle.calculateArea());
        System.out.println("Perimeter:" + circle.calculatePerimeter());
    }
}
