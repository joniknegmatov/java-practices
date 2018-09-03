package jonibek.io.design_patterns.creational.abstract_factory.shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside " + getClass().getSimpleName() + "::draw() method.");
    }
}
