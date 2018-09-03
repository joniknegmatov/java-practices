package jonibek.io.design_patterns.creational.abstract_factory;

import jonibek.io.design_patterns.creational.abstract_factory.color.Color;
import jonibek.io.design_patterns.creational.abstract_factory.shape.Shape;

import java.util.ArrayList;

/**
 * Abstract Factory patterns work around a super-factory which creates other factories.
 * This factory is also called as factory of factories. This type of design pattern comes under
 * creational pattern as this pattern provides one of the best ways to create an object.
 *
 * In Abstract Factory pattern an interface is responsible for creating a factory of related
 * objects without explicitly specifying their classes. Each generated factory can give the objects
 * as per the Factory pattern.
 *
 * Implementation
 * We are going to create a Shape and Color interfaces and concrete classes implementing these interfaces.
 * We create an abstract factory class AbstractFactory as next step. Factory classes ShapeFactory and ColorFactory are defined where each factory extends AbstractFactory. A factory creator/generator class FactoryProducer is created.
 *
 * AbstractFactoryPatternDemo, our demo class uses FactoryProducer to get a AbstractFactory object.
 * It will pass information (CIRCLE / RECTANGLE / SQUARE for Shape) to AbstractFactory
 * to get the type of object it needs. It also passes information (RED / GREEN / BLUE for Color)
 * to AbstractFactory to get the type of object it needs.
 */

public class AbstractFactoryDemo {

    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<>();
        ArrayList<Color> colors = new ArrayList<>();

        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        shapes.add(shapeFactory.getShape("SQUARE"));
        shapes.add(shapeFactory.getShape("RECTANGLE"));
        shapes.add(shapeFactory.getShape("CIRCLE"));

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        colors.add(colorFactory.getColor("RED"));
        colors.add(colorFactory.getColor("GREEN"));
        colors.add(colorFactory.getColor("BLUE"));

        for (Shape shape : shapes){
            shape.draw();
        }

        for (Color color : colors){
            color.fill();
        }
    }
}
