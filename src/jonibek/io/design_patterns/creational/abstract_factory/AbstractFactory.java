package jonibek.io.design_patterns.creational.abstract_factory;

import jonibek.io.design_patterns.creational.abstract_factory.color.Color;
import jonibek.io.design_patterns.creational.abstract_factory.shape.Shape;

public interface AbstractFactory {

    Shape getShape(String shapeType);

    Color getColor(String colorName);
}
