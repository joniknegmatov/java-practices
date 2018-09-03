package jonibek.io.design_patterns.creational.factory;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside " + getClass().getSimpleName() + "::draw() method.");
    }
}
