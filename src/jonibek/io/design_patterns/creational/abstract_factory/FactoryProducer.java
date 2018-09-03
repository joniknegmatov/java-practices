package jonibek.io.design_patterns.creational.abstract_factory;

import jonibek.io.design_patterns.creational.abstract_factory.color.ColorFactory;
import jonibek.io.design_patterns.creational.abstract_factory.shape.ShapeFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {

        if (choice == null)
            return null;

        if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        } else if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        }

        throw new IllegalArgumentException("Wrong factory name : " + choice);
    }
}
