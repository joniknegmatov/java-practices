package jonibek.io.design_patterns.creational.prototype;

public class Circle extends Shape {

    public Circle() {
        type = getClass().getSimpleName();
    }

    @Override
    void draw() {
        System.out.println("Inside " + getClass().getSimpleName()  +"::draw() method.");
    }

}
