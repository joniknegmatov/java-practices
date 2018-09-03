package jonibek.io.design_patterns.creational.prototype;

public class Rectangle extends Shape {

    public Rectangle() {
        type = getClass().getSimpleName();
    }

    @Override
    void draw() {
        System.out.println("Inside " + getClass().getSimpleName()  +"::draw() method.");
    }

}
