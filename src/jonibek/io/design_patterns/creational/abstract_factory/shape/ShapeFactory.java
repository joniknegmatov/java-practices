package jonibek.io.design_patterns.creational.abstract_factory.shape;


import jonibek.io.design_patterns.creational.abstract_factory.AbstractFactory;
import jonibek.io.design_patterns.creational.abstract_factory.color.Color;

public class ShapeFactory implements AbstractFactory {

    public Shape getShape(String shapeType) {

        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }

        throw new IllegalArgumentException("Wrong shape type : " + shapeType);
    }

    @Override
    public Color getColor(String colorName) {
        return null;
    }
}

