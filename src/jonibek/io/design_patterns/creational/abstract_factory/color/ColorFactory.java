package jonibek.io.design_patterns.creational.abstract_factory.color;

import jonibek.io.design_patterns.creational.abstract_factory.AbstractFactory;
import jonibek.io.design_patterns.creational.abstract_factory.shape.Shape;

public class ColorFactory implements AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String colorName) {

        if (colorName == null)
            return null;

        if (colorName.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (colorName.equalsIgnoreCase("BLUE")) {
            return new Blue();
        } else if (colorName.equalsIgnoreCase("GREEN")) {
            return new Green();
        }

        throw new IllegalArgumentException("Wrong color name : " + colorName);
    }
}
