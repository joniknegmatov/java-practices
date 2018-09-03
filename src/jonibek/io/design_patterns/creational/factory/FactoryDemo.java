package jonibek.io.design_patterns.creational.factory;

/**
 * Factory pattern is one of the most used design patterns in Java.
 * This type of design pattern comes under creational pattern as this pattern provides
 * one of the best ways to create an object.
 *
 * In Factory pattern, we create object without exposing the creation logic to the
 * client and refer to newly created object using a common interface.
 *
 * Implementation
 * We're going to create a Shape interface and concrete classes implementing the Shape interface.
 * A factory class ShapeFactory is defined as a next step.
 *
 * FactoryPatternDemo, our demo class will use ShapeFactory to get a Shape object.
 * It will pass information (CIRCLE / RECTANGLE / SQUARE) to ShapeFactory to get the type of object it needs.
 */

import java.util.ArrayList;

public class FactoryDemo {

    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<>();
        ShapeFactory shapeFactory = new ShapeFactory();

        shapes.add(shapeFactory.getShape("Circle"));
        shapes.add(shapeFactory.getShape("Rectangle"));
        shapes.add(shapeFactory.getShape("Square"));

        for (Shape shape : shapes) {
            shape.draw();
        }

        try {
            shapeFactory.getShape("Cylinder");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
