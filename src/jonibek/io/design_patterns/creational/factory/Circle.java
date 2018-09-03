package jonibek.io.design_patterns.creational.factory;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside " + getClass().getSimpleName() + "::draw() method.");
    }
}
